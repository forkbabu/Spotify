package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class VisualSampleEntry extends AbstractSampleEntry implements b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    class a implements com.googlecode.mp4parser.a {
        private final /* synthetic */ long a;
        private final /* synthetic */ com.googlecode.mp4parser.a b;

        a(VisualSampleEntry visualSampleEntry, long j, com.googlecode.mp4parser.a aVar) {
            this.a = j;
            this.b = aVar;
        }

        @Override // com.googlecode.mp4parser.a
        public ByteBuffer K1(long j, long j2) {
            return this.b.K1(j, j2);
        }

        @Override // com.googlecode.mp4parser.a
        public long Z() {
            return this.b.Z();
        }

        @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.googlecode.mp4parser.a
        public void position(long j) {
            this.b.position(j);
        }

        @Override // com.googlecode.mp4parser.a
        public int read(ByteBuffer byteBuffer) {
            if (this.a == this.b.Z()) {
                return -1;
            }
            if (((long) byteBuffer.remaining()) <= this.a - this.b.Z()) {
                return this.b.read(byteBuffer);
            }
            ByteBuffer allocate = ByteBuffer.allocate(rw.n(this.a - this.b.Z()));
            this.b.read(allocate);
            byteBuffer.put((ByteBuffer) allocate.rewind());
            return allocate.capacity();
        }

        @Override // com.googlecode.mp4parser.a
        public long size() {
            return this.a;
        }

        @Override // com.googlecode.mp4parser.a
        public long u(long j, long j2, WritableByteChannel writableByteChannel) {
            return this.b.u(j, j2, writableByteChannel);
        }
    }

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        pe.e(allocate, this.dataReferenceIndex);
        pe.e(allocate, 0);
        pe.e(allocate, 0);
        allocate.putInt((int) this.predefined[0]);
        allocate.putInt((int) this.predefined[1]);
        allocate.putInt((int) this.predefined[2]);
        pe.e(allocate, getWidth());
        pe.e(allocate, getHeight());
        pe.b(allocate, getHorizresolution());
        pe.b(allocate, getVertresolution());
        allocate.putInt((int) 0);
        pe.e(allocate, getFrameCount());
        allocate.put((byte) (h7.q(getCompressorname()) & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put(h7.b(getCompressorname()));
        int q = h7.q(getCompressorname());
        while (q < 31) {
            q++;
            allocate.put((byte) 0);
        }
        pe.e(allocate, getDepth());
        pe.e(allocate, AudioDriver.SPOTIFY_MAX_VOLUME);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getCompressorname() {
        return this.compressorname;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 78;
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        long Z = aVar.Z() + j;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = h7.l(allocate);
        h7.l(allocate);
        h7.l(allocate);
        this.predefined[0] = h7.n(allocate);
        this.predefined[1] = h7.n(allocate);
        this.predefined[2] = h7.n(allocate);
        this.width = h7.l(allocate);
        this.height = h7.l(allocate);
        this.horizresolution = h7.g(allocate);
        this.vertresolution = h7.g(allocate);
        h7.n(allocate);
        this.frameCount = h7.l(allocate);
        int i = allocate.get();
        if (i < 0) {
            i += 256;
        }
        if (i > 31) {
            i = 31;
        }
        byte[] bArr = new byte[i];
        allocate.get(bArr);
        this.compressorname = h7.a(bArr);
        if (i < 31) {
            allocate.get(new byte[(31 - i)]);
        }
        this.depth = h7.l(allocate);
        h7.l(allocate);
        initContainer(new a(this, Z, aVar), j - 78, leVar);
    }

    public void setCompressorname(String str) {
        this.compressorname = str;
    }

    public void setDepth(int i) {
        this.depth = i;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
}
