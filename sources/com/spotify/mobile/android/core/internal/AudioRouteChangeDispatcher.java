package com.spotify.mobile.android.core.internal;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.spotify.mobile.android.core.internal.AudioDriver;

public class AudioRouteChangeDispatcher extends AudioDriver.AudioRouteListenerHandler {
    private OnAudioRouteChangeListener mListener = new NoopListener();
    private final Handler mMainThread;
    private AudioTrack.OnRoutingChangedListener mMarshmallowListener;
    private AudioRouting.OnRoutingChangedListener mNougatListener;

    private static class NoopListener implements OnAudioRouteChangeListener {
        private NoopListener() {
        }

        @Override // com.spotify.mobile.android.core.internal.AudioRouteChangeDispatcher.OnAudioRouteChangeListener
        public void onAudioRouteChanged(String str, int i, String str2) {
        }
    }

    public interface OnAudioRouteChangeListener {
        void onAudioRouteChanged(String str, int i, String str2);
    }

    AudioRouteChangeDispatcher(Handler handler) {
        this.mMainThread = handler;
    }

    private void dispatchOnAudioRouteChanged(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String str = null;
            if (Build.VERSION.SDK_INT >= 28) {
                str = audioDeviceInfo.getAddress();
            }
            this.mListener.onAudioRouteChanged(audioDeviceInfo.getProductName().toString(), audioDeviceInfo.getType(), str);
        }
    }

    public /* synthetic */ void a(AudioTrack audioTrack) {
        dispatchOnAudioRouteChanged(audioTrack.getRoutedDevice());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioRouteListenerHandler
    public void attach(AudioTrack audioTrack) {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener;
        AudioTrack.OnRoutingChangedListener onRoutingChangedListener2;
        int i = Build.VERSION.SDK_INT;
        if (i == 23 && (onRoutingChangedListener2 = this.mMarshmallowListener) != null) {
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener2, this.mMainThread);
        } else if (i >= 24 && (onRoutingChangedListener = this.mNougatListener) != null) {
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, this.mMainThread);
        }
    }

    public /* synthetic */ void b(AudioRouting audioRouting) {
        dispatchOnAudioRouteChanged(audioRouting.getRoutedDevice());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.mobile.android.core.internal.AudioDriver.AudioRouteListenerHandler
    public void detach(AudioTrack audioTrack) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            audioTrack.removeOnRoutingChangedListener(this.mMarshmallowListener);
        } else if (i >= 24) {
            audioTrack.removeOnRoutingChangedListener(this.mNougatListener);
        }
    }

    public void start(OnAudioRouteChangeListener onAudioRouteChangeListener) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            this.mMarshmallowListener = new b(this);
        } else if (i >= 24) {
            this.mNougatListener = new a(this);
        }
        this.mListener = onAudioRouteChangeListener;
        AudioDriver.setAudioRouteListenerHandler(this);
    }

    public void stop() {
        this.mListener = new NoopListener();
        AudioDriver.setAudioRouteListenerHandler(null);
    }
}
