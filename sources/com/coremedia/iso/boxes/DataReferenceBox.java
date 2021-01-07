package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class DataReferenceBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "dref";
    private int flags;
    private int version;

    public DataReferenceBox() {
        super(TYPE);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        pe.h(allocate, this.version);
        pe.f(allocate, this.flags);
        allocate.putInt((int) ((long) getBoxes().size()));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 8;
        return containerSize + ((long) ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8));
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aVar.read(allocate);
        allocate.rewind();
        int i = allocate.get();
        if (i < 0) {
            i += 256;
        }
        this.version = i;
        this.flags = h7.m(allocate);
        initContainer(aVar, j - 8, leVar);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        this.version = i;
    }
}