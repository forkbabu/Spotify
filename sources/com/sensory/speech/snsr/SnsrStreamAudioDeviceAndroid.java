package com.sensory.speech.snsr;

import android.media.AudioRecord;
import android.util.Log;
import com.sensory.speech.snsr.SnsrStream;

/* access modifiers changed from: package-private */
public class SnsrStreamAudioDeviceAndroid implements SnsrStream.Provider {
    private static final int CHANNELS = 16;
    private static final int ENCODING = 2;
    private static final int MIN_BUFFER_SIZE_MS = 1000;
    private static final String TAG = "SnsrStreamAudioDeviceAndroid";
    private AudioRecord mAudio;
    private int mBufferSize;
    private int mSampleRate;
    private int mSource;

    public SnsrStreamAudioDeviceAndroid(int i, int i2) {
        this.mSource = 6;
        double d = (double) i2;
        Double.isNaN(d);
        double d2 = (d * 1000.0d) / 1000.0d;
        int minBufferSize = AudioRecord.getMinBufferSize(i2, 16, 2);
        this.mBufferSize = minBufferSize;
        if (((double) minBufferSize) < d2) {
            double d3 = (double) minBufferSize;
            Double.isNaN(d3);
            this.mBufferSize = minBufferSize * ((int) Math.ceil(d2 / d3));
        }
        this.mSampleRate = i2;
        this.mSource = i;
        double d4 = (double) this.mBufferSize;
        Double.isNaN(d4);
        Double.isNaN(d);
        String.format("mBufferSize = %d (%.3f seconds)", Integer.valueOf(this.mBufferSize), Double.valueOf(d4 / d));
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onClose() {
        try {
            this.mAudio.stop();
        } catch (IllegalStateException unused) {
        }
        this.mAudio.release();
        this.mAudio = null;
        return 0;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onOpen() {
        AudioRecord audioRecord = new AudioRecord(this.mSource, this.mSampleRate, 16, 2, this.mBufferSize);
        this.mAudio = audioRecord;
        if (audioRecord == null || audioRecord.getState() != 1) {
            StringBuilder V0 = je.V0("Could not initialize audio device at ");
            V0.append(this.mSampleRate);
            V0.append(" Hz.");
            Log.e(TAG, V0.toString());
            this.mAudio = null;
            return -6;
        }
        try {
            this.mAudio.startRecording();
            return 0;
        } catch (IllegalStateException e) {
            Log.e(TAG, e.toString());
            return -6;
        }
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onRead(byte[] bArr) {
        int read = this.mAudio.read(bArr, 0, bArr.length);
        if (Thread.interrupted()) {
            return -2;
        }
        if (read == -2) {
            return -3;
        }
        if (read < 0) {
            return -5;
        }
        return (long) read;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public void onRelease() {
        AudioRecord audioRecord = this.mAudio;
        if (audioRecord != null) {
            audioRecord.release();
        }
        this.mAudio = null;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onWrite(byte[] bArr) {
        return -4;
    }

    public SnsrStreamAudioDeviceAndroid(int i) {
        this(6, i);
    }
}
