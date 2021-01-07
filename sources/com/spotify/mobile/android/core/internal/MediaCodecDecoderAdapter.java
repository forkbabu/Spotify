package com.spotify.mobile.android.core.internal;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Keep;
import com.spotify.mobile.android.core.internal.SampleFormat;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.h;

@Keep
public final class MediaCodecDecoderAdapter {
    private final MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
    private MediaCodec codec;
    private MediaFormat format;
    private final ReadResult readResult = new ReadResult();
    private long self;

    private static /* synthetic */ void getSelf$annotations() {
    }

    private final native void onMetadata(int i, int i2, int i3);

    private final native void onRead(ByteBuffer byteBuffer, int i, int i2, ReadResult readResult2);

    private final native int onWrite(ByteBuffer byteBuffer, int i, int i2);

    private final void release() {
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            mediaCodec.release();
        } else {
            h.k("codec");
            throw null;
        }
    }

    public final void flush() {
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            mediaCodec.reset();
            MediaCodec mediaCodec2 = this.codec;
            if (mediaCodec2 != null) {
                MediaFormat mediaFormat = this.format;
                if (mediaFormat != null) {
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    MediaCodec mediaCodec3 = this.codec;
                    if (mediaCodec3 != null) {
                        mediaCodec3.start();
                    } else {
                        h.k("codec");
                        throw null;
                    }
                } else {
                    h.k("format");
                    throw null;
                }
            } else {
                h.k("codec");
                throw null;
            }
        } else {
            h.k("codec");
            throw null;
        }
    }

    public final boolean open(String str, int i, int i2, int i3, byte[] bArr) {
        SampleFormat.Companion companion;
        SampleFormat fromCoreEnum;
        h.e(str, "mimeType");
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        h.d(createAudioFormat, "MediaFormat.createAudioF…ampleRate, inputChannels)");
        this.format = createAudioFormat;
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        MediaFormat mediaFormat = this.format;
        Integer num = null;
        if (mediaFormat != null) {
            String findDecoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormat);
            if (findDecoderForFormat == null || (fromCoreEnum = (companion = SampleFormat.Companion).fromCoreEnum(i3)) == null) {
                return false;
            }
            MediaFormat mediaFormat2 = this.format;
            if (mediaFormat2 != null) {
                mediaFormat2.setInteger("pcm-encoding", fromCoreEnum.getEncoding());
                if (bArr != null) {
                    MediaFormat mediaFormat3 = this.format;
                    if (mediaFormat3 != null) {
                        mediaFormat3.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                    } else {
                        h.k("format");
                        throw null;
                    }
                }
                MediaCodec createByCodecName = MediaCodec.createByCodecName(findDecoderForFormat);
                h.d(createByCodecName, "MediaCodec.createByCodecName(codecName)");
                this.codec = createByCodecName;
                if (createByCodecName != null) {
                    MediaFormat mediaFormat4 = this.format;
                    if (mediaFormat4 != null) {
                        createByCodecName.configure(mediaFormat4, (Surface) null, (MediaCrypto) null, 0);
                        MediaCodec mediaCodec = this.codec;
                        if (mediaCodec != null) {
                            mediaCodec.start();
                            MediaCodec mediaCodec2 = this.codec;
                            if (mediaCodec2 != null) {
                                int integer = mediaCodec2.getOutputFormat().getInteger("sample-rate");
                                MediaCodec mediaCodec3 = this.codec;
                                if (mediaCodec3 != null) {
                                    int integer2 = mediaCodec3.getOutputFormat().getInteger("channel-count");
                                    MediaCodec mediaCodec4 = this.codec;
                                    if (mediaCodec4 != null) {
                                        if (mediaCodec4.getOutputFormat().containsKey("pcm-encoding")) {
                                            MediaCodec mediaCodec5 = this.codec;
                                            if (mediaCodec5 != null) {
                                                num = Integer.valueOf(mediaCodec5.getOutputFormat().getInteger("pcm-encoding"));
                                            } else {
                                                h.k("codec");
                                                throw null;
                                            }
                                        }
                                        SampleFormat fromEncoding = companion.fromEncoding(num);
                                        if (fromEncoding == null) {
                                            fromEncoding = SampleFormat.INT16;
                                        }
                                        onMetadata(integer, integer2, fromEncoding.getCoreEnum());
                                        return true;
                                    }
                                    h.k("codec");
                                    throw null;
                                }
                                h.k("codec");
                                throw null;
                            }
                            h.k("codec");
                            throw null;
                        }
                        h.k("codec");
                        throw null;
                    }
                    h.k("format");
                    throw null;
                }
                h.k("codec");
                throw null;
            }
            h.k("format");
            throw null;
        }
        h.k("format");
        throw null;
    }

    public final int process() {
        int i;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer >= 0) {
                MediaCodec mediaCodec2 = this.codec;
                if (mediaCodec2 != null) {
                    ByteBuffer inputBuffer = mediaCodec2.getInputBuffer(dequeueInputBuffer);
                    h.c(inputBuffer);
                    h.d(inputBuffer, "codec.getInputBuffer(index)!!");
                    onRead(inputBuffer, 0, inputBuffer.remaining(), this.readResult);
                    int status = this.readResult.getStatus();
                    if (status == DecoderState.ERROR.getValue() || status == DecoderState.ABORTED.getValue()) {
                        return this.readResult.getStatus();
                    }
                    if (status == DecoderState.END_OF_STREAM.getValue()) {
                        MediaCodec mediaCodec3 = this.codec;
                        if (mediaCodec3 != null) {
                            mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        } else {
                            h.k("codec");
                            throw null;
                        }
                    } else {
                        MediaCodec mediaCodec4 = this.codec;
                        if (mediaCodec4 != null) {
                            mediaCodec4.queueInputBuffer(dequeueInputBuffer, 0, this.readResult.getSize(), 0, 0);
                        } else {
                            h.k("codec");
                            throw null;
                        }
                    }
                } else {
                    h.k("codec");
                    throw null;
                }
            }
            MediaCodec mediaCodec5 = this.codec;
            if (mediaCodec5 != null) {
                int dequeueOutputBuffer = mediaCodec5.dequeueOutputBuffer(this.bufferInfo, 0);
                if (dequeueOutputBuffer < 0) {
                    return DecoderState.CONTINUE.getValue();
                }
                MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
                boolean z = (bufferInfo2.flags & 4) != 0;
                if (bufferInfo2.size > 0) {
                    MediaCodec mediaCodec6 = this.codec;
                    if (mediaCodec6 != null) {
                        ByteBuffer outputBuffer = mediaCodec6.getOutputBuffer(dequeueOutputBuffer);
                        h.c(outputBuffer);
                        h.d(outputBuffer, "codec.getOutputBuffer(index)!!");
                        MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
                        i = onWrite(outputBuffer, bufferInfo3.offset, bufferInfo3.size);
                    } else {
                        h.k("codec");
                        throw null;
                    }
                } else if (z) {
                    i = DecoderState.END_OF_STREAM.getValue();
                } else {
                    i = DecoderState.CONTINUE.getValue();
                }
                MediaCodec mediaCodec7 = this.codec;
                if (mediaCodec7 != null) {
                    mediaCodec7.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return i;
                }
                h.k("codec");
                throw null;
            }
            h.k("codec");
            throw null;
        }
        h.k("codec");
        throw null;
    }
}
