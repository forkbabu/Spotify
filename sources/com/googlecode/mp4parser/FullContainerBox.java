package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.coremedia.iso.boxes.a;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;

public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.b
    public <T extends a> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractContainerBox
    public ByteBuffer getHeader() {
        ByteBuffer byteBuffer;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[20];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr);
            byteBuffer.position(8);
            byteBuffer.putLong(getSize());
            writeVersionAndFlags(byteBuffer);
        } else {
            byte[] bArr2 = new byte[12];
            bArr2[4] = this.type.getBytes()[0];
            bArr2[5] = this.type.getBytes()[1];
            bArr2[6] = this.type.getBytes()[2];
            bArr2[7] = this.type.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr2);
            byteBuffer.putInt((int) getSize());
            byteBuffer.position(8);
            writeVersionAndFlags(byteBuffer);
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        aVar.read(allocate);
        parseVersionAndFlags((ByteBuffer) allocate.rewind());
        super.parse(aVar, byteBuffer, j, leVar);
    }

    /* access modifiers changed from: protected */
    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.version = i;
        this.flags = h7.m(byteBuffer);
        return 4;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + "[childBoxes]";
    }

    /* access modifiers changed from: protected */
    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.version & BitmapRenderer.ALPHA_VISIBLE));
        pe.f(byteBuffer, this.flags);
    }
}
