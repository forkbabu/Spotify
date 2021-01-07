package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.b;
import com.googlecode.mp4parser.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        int i = this.soundVersion;
        int i2 = 0;
        int i3 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i2 = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3 + i2);
        allocate.position(6);
        pe.e(allocate, this.dataReferenceIndex);
        pe.e(allocate, this.soundVersion);
        pe.e(allocate, this.reserved1);
        allocate.putInt((int) this.reserved2);
        pe.e(allocate, this.channelCount);
        pe.e(allocate, this.sampleSize);
        pe.e(allocate, this.compressionId);
        pe.e(allocate, this.packetSize);
        if (this.type.equals(TYPE10)) {
            allocate.putInt((int) getSampleRate());
        } else {
            allocate.putInt((int) (getSampleRate() << 16));
        }
        if (this.soundVersion == 1) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = this.soundVersion;
        int i2 = 16;
        int i3 = 0;
        int i4 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i3 = 36;
        }
        long containerSize = ((long) (i4 + i3)) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i2 = 8;
        }
        return containerSize + ((long) i2);
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = h7.l(allocate);
        this.soundVersion = h7.l(allocate);
        this.reserved1 = h7.l(allocate);
        this.reserved2 = h7.n(allocate);
        this.channelCount = h7.l(allocate);
        this.sampleSize = h7.l(allocate);
        this.compressionId = h7.l(allocate);
        this.packetSize = h7.l(allocate);
        this.sampleRate = h7.n(allocate);
        int i = 16;
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            aVar.read(allocate2);
            allocate2.rewind();
            this.samplesPerPacket = h7.n(allocate2);
            this.bytesPerPacket = h7.n(allocate2);
            this.bytesPerFrame = h7.n(allocate2);
            this.bytesPerSample = h7.n(allocate2);
        }
        int i2 = 36;
        if (this.soundVersion == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            aVar.read(allocate3);
            allocate3.rewind();
            this.samplesPerPacket = h7.n(allocate3);
            this.bytesPerPacket = h7.n(allocate3);
            this.bytesPerFrame = h7.n(allocate3);
            this.bytesPerSample = h7.n(allocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            allocate3.get(bArr);
        }
        if (TYPE7.equals(this.type)) {
            System.err.println(TYPE7);
            long j2 = j - 28;
            int i3 = this.soundVersion;
            if (i3 != 1) {
                i = 0;
            }
            long j3 = j2 - ((long) i);
            if (i3 != 2) {
                i2 = 0;
            }
            final long j4 = j3 - ((long) i2);
            final ByteBuffer allocate4 = ByteBuffer.allocate(rw.n(j4));
            aVar.read(allocate4);
            addBox(new com.coremedia.iso.boxes.a() {
                /* class com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.AnonymousClass1 */

                @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
                public void getBox(WritableByteChannel writableByteChannel) {
                    allocate4.rewind();
                    writableByteChannel.write(allocate4);
                }

                public long getOffset() {
                    return 0;
                }

                @Override // com.coremedia.iso.boxes.a
                public b getParent() {
                    return AudioSampleEntry.this;
                }

                @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
                public long getSize() {
                    return j4;
                }

                @Override // com.coremedia.iso.boxes.a
                public String getType() {
                    return "----";
                }

                @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
                public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
                    throw new RuntimeException("NotImplemented");
                }

                @Override // com.coremedia.iso.boxes.a
                public void setParent(b bVar) {
                    if (!AudioSampleEntry.$assertionsDisabled && bVar != AudioSampleEntry.this) {
                        throw new AssertionError("you cannot diswown this special box");
                    }
                }
            });
            return;
        }
        long j5 = j - 28;
        int i4 = this.soundVersion;
        if (i4 != 1) {
            i = 0;
        }
        long j6 = j5 - ((long) i);
        if (i4 != 2) {
            i2 = 0;
        }
        initContainer(aVar, j6 - ((long) i2), leVar);
    }

    public void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public void setChannelCount(int i) {
        this.channelCount = i;
    }

    public void setCompressionId(int i) {
        this.compressionId = i;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public void setReserved1(int i) {
        this.reserved1 = i;
    }

    public void setReserved2(long j) {
        this.reserved2 = j;
    }

    public void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.lang.Object
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + getBoxes() + '}';
    }
}
