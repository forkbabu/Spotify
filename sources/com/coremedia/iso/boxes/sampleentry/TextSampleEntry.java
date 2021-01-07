package com.coremedia.iso.boxes.sampleentry;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private b styleRecord;
    private int verticalJustification;

    public static class a {
        int a;
        int b;
        int c;
        int d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.d == aVar.d && this.a == aVar.a;
        }

        public int hashCode() {
            return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
        }
    }

    public static class b {
        int a;
        int b;
        int c;
        int d;
        int e;
        int[] f = {BitmapRenderer.ALPHA_VISIBLE, BitmapRenderer.ALPHA_VISIBLE, BitmapRenderer.ALPHA_VISIBLE, BitmapRenderer.ALPHA_VISIBLE};

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.d == bVar.d && this.c == bVar.c && this.e == bVar.e && this.a == bVar.a && Arrays.equals(this.f, bVar.f);
        }

        public int hashCode() {
            int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
            int[] iArr = this.f;
            return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        pe.e(allocate, this.dataReferenceIndex);
        allocate.putInt((int) this.displayFlags);
        allocate.put((byte) (this.horizontalJustification & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (this.verticalJustification & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (this.backgroundColorRgba[0] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (this.backgroundColorRgba[1] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (this.backgroundColorRgba[2] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (this.backgroundColorRgba[3] & BitmapRenderer.ALPHA_VISIBLE));
        a aVar = this.boxRecord;
        pe.e(allocate, aVar.a);
        pe.e(allocate, aVar.b);
        pe.e(allocate, aVar.c);
        pe.e(allocate, aVar.d);
        b bVar = this.styleRecord;
        pe.e(allocate, bVar.a);
        pe.e(allocate, bVar.b);
        pe.e(allocate, bVar.c);
        allocate.put((byte) (bVar.d & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (bVar.e & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (bVar.f[0] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (bVar.f[1] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (bVar.f[2] & BitmapRenderer.ALPHA_VISIBLE));
        allocate.put((byte) (bVar.f[3] & BitmapRenderer.ALPHA_VISIBLE));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((long) ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8));
    }

    public b getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & 2048) == 2048;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & 262144) == 262144;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & 131072) == 131072;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = h7.l(allocate);
        this.displayFlags = h7.n(allocate);
        int i = allocate.get();
        if (i < 0) {
            i += 256;
        }
        this.horizontalJustification = i;
        int i2 = allocate.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.verticalJustification = i2;
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        int i3 = allocate.get();
        if (i3 < 0) {
            i3 += 256;
        }
        iArr[0] = i3;
        int[] iArr2 = this.backgroundColorRgba;
        int i4 = allocate.get();
        if (i4 < 0) {
            i4 += 256;
        }
        iArr2[1] = i4;
        int[] iArr3 = this.backgroundColorRgba;
        int i5 = allocate.get();
        if (i5 < 0) {
            i5 += 256;
        }
        iArr3[2] = i5;
        int[] iArr4 = this.backgroundColorRgba;
        int i6 = allocate.get();
        if (i6 < 0) {
            i6 += 256;
        }
        iArr4[3] = i6;
        a aVar2 = new a();
        this.boxRecord = aVar2;
        aVar2.a = h7.l(allocate);
        aVar2.b = h7.l(allocate);
        aVar2.c = h7.l(allocate);
        aVar2.d = h7.l(allocate);
        b bVar = new b();
        this.styleRecord = bVar;
        bVar.a = h7.l(allocate);
        bVar.b = h7.l(allocate);
        bVar.c = h7.l(allocate);
        int i7 = allocate.get();
        if (i7 < 0) {
            i7 += 256;
        }
        bVar.d = i7;
        int i8 = allocate.get();
        if (i8 < 0) {
            i8 += 256;
        }
        bVar.e = i8;
        int[] iArr5 = new int[4];
        bVar.f = iArr5;
        int i9 = allocate.get();
        if (i9 < 0) {
            i9 += 256;
        }
        iArr5[0] = i9;
        int[] iArr6 = bVar.f;
        int i10 = allocate.get();
        if (i10 < 0) {
            i10 += 256;
        }
        iArr6[1] = i10;
        int[] iArr7 = bVar.f;
        int i11 = allocate.get();
        if (i11 < 0) {
            i11 += 256;
        }
        iArr7[2] = i11;
        int[] iArr8 = bVar.f;
        int i12 = allocate.get();
        if (i12 < 0) {
            i12 += 256;
        }
        iArr8[3] = i12;
        initContainer(aVar, j - 38, leVar);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(a aVar) {
        this.boxRecord = aVar;
    }

    public void setContinuousKaraoke(boolean z) {
        if (z) {
            this.displayFlags |= 2048;
        } else {
            this.displayFlags &= -2049;
        }
    }

    public void setFillTextRegion(boolean z) {
        if (z) {
            this.displayFlags |= 262144;
        } else {
            this.displayFlags &= -262145;
        }
    }

    public void setHorizontalJustification(int i) {
        this.horizontalJustification = i;
    }

    public void setScrollDirection(boolean z) {
        if (z) {
            this.displayFlags |= 384;
        } else {
            this.displayFlags &= -385;
        }
    }

    public void setScrollIn(boolean z) {
        if (z) {
            this.displayFlags |= 32;
        } else {
            this.displayFlags &= -33;
        }
    }

    public void setScrollOut(boolean z) {
        if (z) {
            this.displayFlags |= 64;
        } else {
            this.displayFlags &= -65;
        }
    }

    public void setStyleRecord(b bVar) {
        this.styleRecord = bVar;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i) {
        this.verticalJustification = i;
    }

    public void setWriteTextVertically(boolean z) {
        if (z) {
            this.displayFlags |= 131072;
        } else {
            this.displayFlags &= -131073;
        }
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.lang.Object
    public String toString() {
        return "TextSampleEntry";
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }
}
