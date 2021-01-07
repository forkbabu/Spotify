package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class AbstractContainerBox extends BasicContainer implements a {
    protected boolean largeBox;
    private long offset;
    b parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    /* access modifiers changed from: protected */
    public ByteBuffer getHeader() {
        ByteBuffer byteBuffer;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr);
            byteBuffer.position(8);
            byteBuffer.putLong(getSize());
        } else {
            byte[] bArr2 = new byte[8];
            bArr2[4] = this.type.getBytes()[0];
            bArr2[5] = this.type.getBytes()[1];
            bArr2[6] = this.type.getBytes()[2];
            bArr2[7] = this.type.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(bArr2);
            byteBuffer.putInt((int) getSize());
        }
        byteBuffer.rewind();
        return byteBuffer;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.a
    public b getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.a
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(a aVar, long j, le leVar) {
        this.dataSource = aVar;
        long Z = aVar.Z();
        this.parsePosition = Z;
        this.startPosition = Z - ((long) ((this.largeBox || 8 + j >= 4294967296L) ? 16 : 8));
        aVar.position(aVar.Z() + j);
        this.endPosition = aVar.Z();
        this.boxParser = leVar;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        this.offset = aVar.Z() - ((long) byteBuffer.remaining());
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(aVar, j, leVar);
    }

    @Override // com.coremedia.iso.boxes.a
    public void setParent(b bVar) {
        this.parent = bVar;
    }
}
