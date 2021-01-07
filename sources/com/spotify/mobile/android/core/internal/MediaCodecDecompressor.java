package com.spotify.mobile.android.core.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Keep;
import java.io.IOException;
import java.nio.ByteBuffer;

@Keep
public class MediaCodecDecompressor {
    private MediaCodec mCodec;
    private ByteBuffer[] mInputBuffers;
    private final MediaCodecFactory mMediaCodecFactory;
    private final NativeWrapper mNativeWrapper;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private long nThis;

    private static class DefaultMediaCodecFactory implements MediaCodecFactory {
        private DefaultMediaCodecFactory() {
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecDecompressor.MediaCodecFactory
        public MediaCodec createDecoderByType(String str) {
            return MediaCodec.createDecoderByType(str);
        }
    }

    private class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecDecompressor.NativeWrapper
        public int onInputBuffer(ByteBuffer byteBuffer) {
            return MediaCodecDecompressor.this.onInputBuffer(byteBuffer);
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecDecompressor.NativeWrapper
        public void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
            MediaCodecDecompressor.this.onOutputBuffer(byteBuffer, i, i2, z);
        }
    }

    public interface MediaCodecFactory {
        MediaCodec createDecoderByType(String str);
    }

    public interface NativeWrapper {
        int onInputBuffer(ByteBuffer byteBuffer);

        void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);
    }

    public MediaCodecDecompressor() {
        this.mNativeWrapper = new DefaultNativeWrapper();
        this.mMediaCodecFactory = new DefaultMediaCodecFactory();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native int onInputBuffer(ByteBuffer byteBuffer);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);

    public void destroy() {
        this.mCodec.stop();
        this.mCodec.release();
    }

    public void flush() {
        this.mCodec.flush();
    }

    public int getChannelCount() {
        if (this.mOutputFormat.containsKey("channel-count")) {
            return this.mOutputFormat.getInteger("channel-count");
        }
        return -1;
    }

    public int getSampleRate() {
        if (this.mOutputFormat.containsKey("sample-rate")) {
            return this.mOutputFormat.getInteger("sample-rate");
        }
        return -1;
    }

    public boolean open(String str, int i, int i2, ByteBuffer byteBuffer) {
        try {
            this.mCodec = this.mMediaCodecFactory.createDecoderByType(str);
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
            if (byteBuffer != null) {
                createAudioFormat.setByteBuffer("csd-0", byteBuffer);
            }
            this.mCodec.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mOutputFormat = this.mCodec.getOutputFormat();
            this.mCodec.start();
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void processInput() {
        int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(0);
        if (dequeueInputBuffer >= 0) {
            int onInputBuffer = this.mNativeWrapper.onInputBuffer(this.mInputBuffers[dequeueInputBuffer]);
            this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, onInputBuffer, 0, onInputBuffer == 0 ? 4 : 0);
        }
    }

    public void processOutput() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, 0);
        if (dequeueOutputBuffer >= 0) {
            this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.offset, bufferInfo.size, (bufferInfo.flags & 4) == 4);
            this.mCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
        } else if (dequeueOutputBuffer == -3) {
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
        } else if (dequeueOutputBuffer == -2) {
            this.mOutputFormat = this.mCodec.getOutputFormat();
        }
    }

    MediaCodecDecompressor(NativeWrapper nativeWrapper, MediaCodecFactory mediaCodecFactory) {
        this.mNativeWrapper = nativeWrapper;
        this.mMediaCodecFactory = mediaCodecFactory;
    }
}
