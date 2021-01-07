package com.spotify.mobile.android.core.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Keep;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;

@Keep
public class MediaCodecFileDecompressor {
    private MediaCodec mCodec;
    private boolean mEndOfInputStream;
    private ByteBuffer[] mInputBuffers;
    private MediaFormat mInputFormat;
    private final MediaCodecFactory mMediaCodecFactory;
    private MediaExtractor mMediaExtractor;
    private final MediaExtractorFactory mMediaExtractorFactory;
    private final NativeWrapper mNativeWrapper;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private long nThis;

    private static class DefaultMediaCodecFactory implements MediaCodecFactory {
        private DefaultMediaCodecFactory() {
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecFileDecompressor.MediaCodecFactory
        public MediaCodec createDecoderByType(String str) {
            return MediaCodec.createDecoderByType(str);
        }
    }

    private static class DefaultMediaExtractorFactory implements MediaExtractorFactory {
        private DefaultMediaExtractorFactory() {
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecFileDecompressor.MediaExtractorFactory
        public MediaExtractor createExtractor() {
            return new MediaExtractor();
        }
    }

    private class DefaultNativeWrapper implements NativeWrapper {
        private DefaultNativeWrapper() {
        }

        @Override // com.spotify.mobile.android.core.internal.MediaCodecFileDecompressor.NativeWrapper
        public void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
            MediaCodecFileDecompressor.this.onOutputBuffer(byteBuffer, i, i2, z);
        }
    }

    public interface MediaCodecFactory {
        MediaCodec createDecoderByType(String str);
    }

    public interface MediaExtractorFactory {
        MediaExtractor createExtractor();
    }

    public interface NativeWrapper {
        void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);
    }

    public MediaCodecFileDecompressor() {
        this.mNativeWrapper = new DefaultNativeWrapper();
        this.mMediaCodecFactory = new DefaultMediaCodecFactory();
        this.mMediaExtractorFactory = new DefaultMediaExtractorFactory();
    }

    private void decodeInternal(boolean z) {
        int dequeueInputBuffer;
        boolean z2 = false;
        if (!this.mEndOfInputStream && (dequeueInputBuffer = this.mCodec.dequeueInputBuffer(0)) >= 0) {
            int readSampleData = this.mMediaExtractor.readSampleData(this.mInputBuffers[dequeueInputBuffer], 0);
            if (readSampleData < 0) {
                this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                this.mEndOfInputStream = true;
            } else {
                this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
                this.mMediaExtractor.advance();
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, 0);
        if (dequeueOutputBuffer >= 0) {
            if (z) {
                if ((bufferInfo.flags & 4) == 4) {
                    z2 = true;
                }
                this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.offset, bufferInfo.size, z2);
            } else {
                Logger.d("Got data before output format, that shouldn't happen!", new Object[0]);
            }
            this.mCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
        } else if (dequeueOutputBuffer == -3) {
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
        } else if (dequeueOutputBuffer == -2) {
            this.mOutputFormat = this.mCodec.getOutputFormat();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void onOutputBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z);

    public void decode() {
        decodeInternal(true);
    }

    public void destroy() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mCodec.release();
        }
        MediaExtractor mediaExtractor = this.mMediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    public int getChannelCount() {
        if (this.mOutputFormat.containsKey("channel-count")) {
            return this.mOutputFormat.getInteger("channel-count");
        }
        return -1;
    }

    public long getDurationUs() {
        if (this.mInputFormat.containsKey("durationUs")) {
            return this.mInputFormat.getLong("durationUs");
        }
        return -1;
    }

    public String getMimeType() {
        return this.mInputFormat.containsKey("mime") ? this.mInputFormat.getString("mime") : "";
    }

    public int getSampleRate() {
        if (this.mOutputFormat.containsKey("sample-rate")) {
            return this.mOutputFormat.getInteger("sample-rate");
        }
        return -1;
    }

    public boolean open(String str) {
        try {
            MediaExtractor createExtractor = this.mMediaExtractorFactory.createExtractor();
            this.mMediaExtractor = createExtractor;
            createExtractor.setDataSource(str);
            int trackCount = this.mMediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    break;
                }
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i);
                this.mInputFormat = trackFormat;
                String string = trackFormat.getString("mime");
                if (string.startsWith("audio/")) {
                    this.mMediaExtractor.selectTrack(i);
                    MediaCodec createDecoderByType = this.mMediaCodecFactory.createDecoderByType(string);
                    this.mCodec = createDecoderByType;
                    createDecoderByType.configure(this.mInputFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
                i++;
            }
            MediaCodec mediaCodec = this.mCodec;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.start();
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            int i2 = 0;
            while (this.mOutputFormat == null) {
                decodeInternal(false);
                i2++;
                if (i2 > 100) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void seekToUs(long j) {
        this.mMediaExtractor.seekTo(j, 1);
        this.mCodec.flush();
        this.mEndOfInputStream = false;
    }

    MediaCodecFileDecompressor(NativeWrapper nativeWrapper, MediaCodecFactory mediaCodecFactory, MediaExtractorFactory mediaExtractorFactory) {
        this.mNativeWrapper = nativeWrapper;
        this.mMediaCodecFactory = mediaCodecFactory;
        this.mMediaExtractorFactory = mediaExtractorFactory;
    }
}
