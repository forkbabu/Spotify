package com.spotify.mobile.android.core.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.x;
import java.util.ArrayList;
import java.util.List;

public class AudioDriver implements AudioTrack.OnPlaybackPositionUpdateListener {
    static final float DUCKING_LOWEST_VOLUME = 0.25f;
    private static final int DUCKING_RAMPDOWN_TIME_MS = 200;
    private static final int DUCKING_RAMPUP_TIME_MS = 1000;
    private static final int DUCKING_RAMP_TIME_DELTA_MS = 50;
    private static final boolean LOGGING_ENABLED = false;
    static final int MESSAGE_SET_VOLUME = 1;
    private static final int MINIMUM_WRITTEN_BEFORE_PLAY = 512;
    public static final int SPOTIFY_MAX_VOLUME = 65535;
    private static AudioDriverCallbacks sAudioDriverCallbacks;
    private static final List<AudioDriverListener> sAudioDriverListeners = new ArrayList();
    private static AudioDriverVolumeController sAudioDriverVolumeController;
    private static AudioRouteListenerHandler sAudioRouteListenerHandler = new NoopAudioRouteListenerHandler();
    private static final SparseArray<AudioDriver> sSessionToAudioDriverMap = new SparseArray<>();
    private int mAudioContentType;
    private Integer mAudioSessionId;
    private int mAudioStreamType;
    private AudioTrack mAudioTrack;
    private int mBufferSizeInBytes;
    private int mBytesPerFrame;
    private int mChannelConfig;
    private boolean mCreateFailed;
    private float mCurrentVolumeGain;
    private float mCurrentVolumeTarget;
    private int mFramesBufferedBeforePlay;
    private VolumeHandler mHandler;
    private HandlerThread mHandlerThread;
    private Looper mLooper;
    private int mMarkerFallbackPosition;
    private final Object mMutex;
    private final NativeWrapper mNativeWrapper;
    private boolean mOpen;
    private boolean mPaused;
    private boolean mPlaying;
    private final int mSampleFormat;
    private int mSampleRate;
    private long nThis;

    public interface AudioDriverCallbacks {
        void abandonAudioFocus();

        boolean maybeAbandonAudioFocus();

        boolean requestAudioFocus(int i, int i2);
    }

    public interface AudioDriverListener {
        void onAudioTrackCreated(int i);

        void onAudioTrackDestroyed(int i);

        void onPaused(boolean z, Integer num);
    }

    public interface AudioDriverVolumeController {
        int onGetVolume();

        void onSetVolume(int i);
    }

    /* access modifiers changed from: package-private */
    public static abstract class AudioRouteListenerHandler {
        AudioRouteListenerHandler() {
        }

        /* access modifiers changed from: package-private */
        public abstract void attach(AudioTrack audioTrack);

        /* access modifiers changed from: package-private */
        public abstract void detach(AudioTrack audioTrack);
    }

    private class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.NativeWrapper
        public void onBufferUnderrun() {
            AudioDriver.this.onBufferUnderrun();
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.NativeWrapper
        public void onDestroy() {
            AudioDriver.this.onDestroy();
        }

        @Override // com.spotify.mobile.android.core.internal.AudioDriver.NativeWrapper
        public void onFlush() {
            AudioDriver.this.onFlush();
        }
    }

    public interface NativeWrapper {
        void onBufferUnderrun();

        void onDestroy();

        void onFlush();
    }

    private static class NoopAudioRouteListenerHandler extends AudioRouteListenerHandler {
        private NoopAudioRouteListenerHandler() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioRouteListenerHandler
        public void attach(AudioTrack audioTrack) {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioRouteListenerHandler
        public void detach(AudioTrack audioTrack) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class VolumeHandler extends Handler {
        private final AudioDriver mAudioDriver;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (this.mAudioDriver.mMutex) {
                if (message.what == 1) {
                    Float f = (Float) message.obj;
                    if (this.mAudioDriver.mAudioTrack != null) {
                        AudioDriver.setAudioTrackVolume(f.floatValue(), this.mAudioDriver.mAudioTrack);
                    }
                    this.mAudioDriver.mCurrentVolumeGain = f.floatValue();
                }
            }
            super.handleMessage(message);
        }

        private VolumeHandler(Looper looper, AudioDriver audioDriver) {
            super(looper);
            this.mAudioDriver = audioDriver;
        }
    }

    public AudioDriver() {
        this.mSampleFormat = 2;
        this.mMutex = new Object();
        this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
        this.mCurrentVolumeTarget = 1.0f;
        this.mPaused = true;
        this.mNativeWrapper = new DefaultNativeWrapper();
    }

    private static void abandonAudioFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            sAudioDriverCallbacks.abandonAudioFocus();
        }
    }

    public static void addListener(AudioDriverListener audioDriverListener) {
        sAudioDriverListeners.add(audioDriverListener);
    }

    private void cancelDucking(int i) {
        this.mHandler.removeMessages(1);
        sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), i);
    }

    public static void cancelDuckingAudioSession(int i) {
        cancelDuckingAudioSession(i, 0);
    }

    public static void clearListeners() {
        sAudioDriverListeners.clear();
    }

    private AudioAttributes constructAudioAttributes() {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setAllowedCapturePolicy(2).setContentType(this.mAudioContentType);
        int i = 4;
        if (this.mAudioStreamType != 4) {
            i = 1;
        }
        return contentType.setUsage(i).build();
    }

    private AudioAttributes constructAudioAttributesLollipop() {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setContentType(this.mAudioContentType);
        int i = 4;
        if (this.mAudioStreamType != 4) {
            i = 1;
        }
        return contentType.setUsage(i).build();
    }

    private AudioTrack constructAudioTrack(Integer num) {
        AudioAttributes audioAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            audioAttributes = constructAudioAttributes();
        } else {
            audioAttributes = constructAudioAttributesLollipop();
        }
        return new AudioTrack(audioAttributes, new AudioFormat.Builder().setSampleRate(this.mSampleRate).setChannelMask(this.mChannelConfig).setEncoding(2).build(), this.mBufferSizeInBytes, 1, num != null ? num.intValue() : 0);
    }

    private AudioTrack constructAudioTrackLegacy(Integer num) {
        return new AudioTrack(this.mAudioStreamType, this.mSampleRate, this.mChannelConfig, 2, this.mBufferSizeInBytes, 1, num != null ? num.intValue() : 0);
    }

    private void createAudioTrack() {
        AudioTrack audioTrack;
        if (Build.VERSION.SDK_INT >= 21) {
            audioTrack = constructAudioTrack(this.mAudioSessionId);
        } else {
            audioTrack = constructAudioTrackLegacy(this.mAudioSessionId);
        }
        if (audioTrack.getState() == 0) {
            this.mCreateFailed = true;
            return;
        }
        this.mCreateFailed = false;
        this.mAudioTrack = audioTrack;
        audioTrack.setPlaybackPositionUpdateListener(this, this.mHandler);
        synchronized (this.mMutex) {
            this.mMarkerFallbackPosition = 0;
            setAudioTrackVolume(AudioTrack.getMaxVolume() * this.mCurrentVolumeGain, this.mAudioTrack);
        }
        this.mAudioSessionId = Integer.valueOf(this.mAudioTrack.getAudioSessionId());
        sAudioRouteListenerHandler.attach(this.mAudioTrack);
        sSessionToAudioDriverMap.put(this.mAudioTrack.getAudioSessionId(), this);
        dispatchOnAudioTrackCreated(this.mAudioTrack.getAudioSessionId());
    }

    private void destroyAudioTrack() {
        if (this.mAudioTrack != null) {
            synchronized (this.mMutex) {
                sAudioRouteListenerHandler.detach(this.mAudioTrack);
                dispatchOnAudioTrackDestroyed(this.mAudioTrack.getAudioSessionId());
                sSessionToAudioDriverMap.delete(this.mAudioTrack.getAudioSessionId());
                this.mPlaying = false;
                this.mAudioTrack.setPlaybackPositionUpdateListener(null, this.mHandler);
                this.mAudioTrack.flush();
                this.mAudioTrack.stop();
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
        }
    }

    public static void dispatchOnAudioTrackCreated(int i) {
        for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
            audioDriverListener.onAudioTrackCreated(i);
        }
    }

    public static void dispatchOnAudioTrackDestroyed(int i) {
        for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
            audioDriverListener.onAudioTrackDestroyed(i);
        }
    }

    private static boolean internalAudioFocusHandlingEnabled() {
        return sAudioDriverCallbacks != null;
    }

    private static void maybeAbandonFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            sAudioDriverCallbacks.maybeAbandonAudioFocus();
        }
    }

    private void maybeStartPlayback() {
        if (!this.mPaused && this.mPlaying) {
            synchronized (this.mMutex) {
                if (this.mFramesBufferedBeforePlay >= MINIMUM_WRITTEN_BEFORE_PLAY && requestAudioFocus()) {
                    this.mAudioTrack.play();
                    this.mFramesBufferedBeforePlay = 0;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void onBufferUnderrun();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void onDestroy();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void onFlush();

    public static void removeListener(AudioDriverListener audioDriverListener) {
        sAudioDriverListeners.remove(audioDriverListener);
    }

    private boolean requestAudioFocus() {
        if (internalAudioFocusHandlingEnabled()) {
            return sAudioDriverCallbacks.requestAudioFocus(this.mAudioStreamType, this.mAudioContentType);
        }
        return true;
    }

    private void sendVolumeUpdateDelayed(float f, int i) {
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, Float.valueOf(f)), (long) i);
    }

    public static void setAudioDriverCallbacks(AudioDriverCallbacks audioDriverCallbacks) {
        sAudioDriverCallbacks = audioDriverCallbacks;
    }

    public static void setAudioDriverVolumeController(AudioDriverVolumeController audioDriverVolumeController) {
        sAudioDriverVolumeController = audioDriverVolumeController;
    }

    static void setAudioRouteListenerHandler(AudioRouteListenerHandler audioRouteListenerHandler) {
        if (audioRouteListenerHandler != null) {
            sAudioRouteListenerHandler = audioRouteListenerHandler;
        } else {
            sAudioRouteListenerHandler = new NoopAudioRouteListenerHandler();
        }
    }

    /* access modifiers changed from: private */
    public static void setAudioTrackVolume(float f, AudioTrack audioTrack) {
        if (Build.VERSION.SDK_INT >= 21) {
            audioTrack.setVolume(f);
        } else {
            audioTrack.setStereoVolume(f, f);
        }
    }

    private static int snapRampTimeToDelta(int i) {
        int i2 = i % 50;
        return i2 != 0 ? (i + 50) - i2 : i;
    }

    private void startDucking(int i, float f) {
        float f2;
        this.mHandler.removeMessages(1);
        if (f < 0.0f || f > 1.0f) {
            Assertion.g("Requested volume must be between 0.0 and 1.0");
            return;
        }
        float maxVolume = AudioTrack.getMaxVolume();
        synchronized (this.mMutex) {
            f2 = this.mCurrentVolumeGain;
        }
        float f3 = f2 - f;
        int snapRampTimeToDelta = snapRampTimeToDelta((int) ((f3 / (maxVolume - f)) * ((float) i)));
        if (snapRampTimeToDelta >= 0) {
            this.mCurrentVolumeTarget = f;
            if (snapRampTimeToDelta == 0) {
                sendVolumeUpdateDelayed(f, 0);
                return;
            }
            for (int i2 = 0; i2 <= snapRampTimeToDelta; i2 += 50) {
                sendVolumeUpdateDelayed(((((float) (snapRampTimeToDelta - i2)) / ((float) snapRampTimeToDelta)) * f3) + f, i2);
            }
        }
    }

    public static void startDuckingAudioSession(int i) {
        startDuckingAudioSession(i, 200, DUCKING_LOWEST_VOLUME);
    }

    private void stopDucking(int i) {
        float f;
        this.mHandler.removeMessages(1);
        float maxVolume = AudioTrack.getMaxVolume();
        synchronized (this.mMutex) {
            f = this.mCurrentVolumeGain;
        }
        float f2 = this.mCurrentVolumeTarget;
        int snapRampTimeToDelta = snapRampTimeToDelta((int) ((1.0f - ((f - f2) / (maxVolume - f2))) * ((float) i)));
        if (snapRampTimeToDelta >= 0) {
            this.mCurrentVolumeTarget = 1.0f;
            if (snapRampTimeToDelta == 0) {
                sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), 0);
                return;
            }
            for (int i2 = 0; i2 <= snapRampTimeToDelta; i2 += 50) {
                sendVolumeUpdateDelayed(je.a(maxVolume, f, ((float) i2) / ((float) snapRampTimeToDelta), f), i2);
            }
        }
    }

    public static void stopDuckingAudioSession(int i) {
        stopDuckingAudioSession(i, 1000);
    }

    public void destroy() {
        this.mPlaying = false;
        this.mPaused = true;
        this.mOpen = false;
        for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
            audioDriverListener.onPaused(true, this.mAudioSessionId);
        }
        if (this.mAudioTrack != null) {
            destroyAudioTrack();
            abandonAudioFocus();
            this.mNativeWrapper.onDestroy();
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                try {
                    handlerThread.quit();
                    handlerThread.join(1000);
                } catch (InterruptedException e) {
                    Logger.o(e, "Interrupted while waiting for notification thread to join", new Object[0]);
                }
            }
            this.mHandlerThread = null;
            this.mHandler = null;
        }
    }

    public void flush() {
        if (this.mOpen) {
            this.mPlaying = false;
            this.mFramesBufferedBeforePlay = 0;
            if (this.mCreateFailed) {
                createAudioTrack();
            } else {
                AudioTrack audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    audioTrack.pause();
                    destroyAudioTrack();
                    createAudioTrack();
                } else {
                    return;
                }
            }
            this.mNativeWrapper.onFlush();
            return;
        }
        throw new IllegalStateException("cannot call flush() on destroyed object");
    }

    public AudioDriverCallbacks getAudioDriverCallbacks() {
        return sAudioDriverCallbacks;
    }

    /* access modifiers changed from: package-private */
    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    public int getFreeSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        return this.mBufferSizeInBytes - (getQueuedSize() * this.mBytesPerFrame);
    }

    public int getPosition() {
        int max;
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mMutex) {
            max = Math.max(0, this.mAudioTrack.getPlaybackHeadPosition());
        }
        return max;
    }

    public int getQueuedSize() {
        if (this.mAudioTrack == null) {
            return 0;
        }
        synchronized (this.mMutex) {
            if (this.mPlaying) {
                int notificationMarkerPosition = this.mAudioTrack.getNotificationMarkerPosition();
                if (notificationMarkerPosition == 0) {
                    notificationMarkerPosition = this.mMarkerFallbackPosition;
                }
                return Math.max(0, notificationMarkerPosition - this.mAudioTrack.getPlaybackHeadPosition());
            }
            return this.mFramesBufferedBeforePlay;
        }
    }

    public int getVolume() {
        AudioDriverVolumeController audioDriverVolumeController = sAudioDriverVolumeController;
        return audioDriverVolumeController != null ? audioDriverVolumeController.onGetVolume() : SPOTIFY_MAX_VOLUME;
    }

    public VolumeHandler getVolumeHandler() {
        return this.mHandler;
    }

    public boolean isPlaying() {
        if (this.mAudioTrack != null && this.mPlaying && getQueuedSize() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(AudioTrack audioTrack) {
        if (this.mOpen) {
            synchronized (this.mMutex) {
                if (!this.mOpen) {
                    return;
                }
                if (x.j(audioTrack, this.mAudioTrack)) {
                    int notificationMarkerPosition = audioTrack.getNotificationMarkerPosition();
                    if (notificationMarkerPosition == 0) {
                        notificationMarkerPosition = this.mMarkerFallbackPosition;
                    }
                    if (audioTrack.getPlaybackHeadPosition() >= notificationMarkerPosition) {
                        this.mNativeWrapper.onBufferUnderrun();
                    }
                } else {
                    return;
                }
            }
            for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
                audioDriverListener.onPaused(true, this.mAudioSessionId);
            }
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public void open(int i, int i2) {
        open(i, i2, 0);
    }

    public void setPaused(boolean z) {
        this.mPaused = z;
        for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
            audioDriverListener.onPaused(z, this.mAudioSessionId);
        }
        if (this.mAudioTrack != null) {
            if (this.mPaused) {
                maybeAbandonFocus();
                this.mAudioTrack.pause();
                return;
            }
            maybeStartPlayback();
        }
    }

    public void setVolume(int i) {
        AudioDriverVolumeController audioDriverVolumeController = sAudioDriverVolumeController;
        if (audioDriverVolumeController != null) {
            audioDriverVolumeController.onSetVolume(i);
        }
    }

    public void startPlayback() {
        this.mPlaying = true;
        maybeStartPlayback();
        for (AudioDriverListener audioDriverListener : sAudioDriverListeners) {
            audioDriverListener.onPaused(this.mPaused, this.mAudioSessionId);
        }
    }

    public void stopPlayback() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.pause();
        }
    }

    public int write(byte[] bArr, int i) {
        int write;
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || (write = audioTrack.write(bArr, 0, i)) <= 0) {
            return 0;
        }
        synchronized (this.mMutex) {
            AudioTrack audioTrack2 = this.mAudioTrack;
            audioTrack2.setNotificationMarkerPosition(audioTrack2.getNotificationMarkerPosition() + (write / this.mBytesPerFrame));
            this.mMarkerFallbackPosition += write / this.mBytesPerFrame;
            if (this.mAudioTrack.getPlayState() != 3) {
                this.mFramesBufferedBeforePlay += write / this.mBytesPerFrame;
            }
        }
        maybeStartPlayback();
        return write;
    }

    public static void cancelDuckingAudioSession(int i, int i2) {
        AudioDriver audioDriver = sSessionToAudioDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.cancelDucking(i2);
        }
    }

    public static void startDuckingAudioSession(int i, int i2, float f) {
        AudioDriver audioDriver = sSessionToAudioDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.startDucking(i2, f);
        }
    }

    public static void stopDuckingAudioSession(int i, int i2) {
        AudioDriver audioDriver = sSessionToAudioDriverMap.get(i);
        if (audioDriver != null) {
            audioDriver.stopDucking(i2);
        }
    }

    public void open(int i, int i2, int i3) {
        open(i, i2, i3, 0);
    }

    public void open(int i, int i2, int i3, int i4) {
        Process.setThreadPriority(-16);
        this.mSampleRate = i;
        this.mChannelConfig = i2 == 1 ? 4 : 12;
        this.mAudioStreamType = AudioUtility.mapCoreStreamTypeToAndroidStreamType(i3);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mAudioContentType = AudioUtility.mapCoreAudioContentTypeToAndroidAudioContentType(i4);
        } else {
            this.mAudioContentType = i4;
        }
        int i5 = i2 * 2;
        this.mBytesPerFrame = i5;
        int i6 = i5 * i * 1;
        this.mBufferSizeInBytes = i6;
        this.mBufferSizeInBytes = Math.max(i6, AudioTrack.getMinBufferSize(i, this.mChannelConfig, 2));
        if (this.mLooper == null) {
            HandlerThread handlerThread = new HandlerThread("AudioDriverHandlerThread");
            handlerThread.start();
            this.mLooper = handlerThread.getLooper();
            this.mHandlerThread = handlerThread;
        }
        this.mHandler = new VolumeHandler(this.mLooper, this);
        this.mOpen = true;
        createAudioTrack();
        if (this.mAudioTrack != null) {
            synchronized (this.mMutex) {
                this.mAudioTrack.setNotificationMarkerPosition(0);
                this.mMarkerFallbackPosition = 0;
            }
        }
    }

    AudioDriver(NativeWrapper nativeWrapper, Looper looper) {
        this.mSampleFormat = 2;
        this.mMutex = new Object();
        this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
        this.mCurrentVolumeTarget = 1.0f;
        this.mNativeWrapper = nativeWrapper;
        this.mLooper = looper;
        this.mPaused = true;
    }
}
