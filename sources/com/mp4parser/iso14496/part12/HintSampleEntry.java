package com.mp4parser.iso14496.part12;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class HintSampleEntry extends AbstractSampleEntry {
    protected byte[] data;

    public HintSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        pe.e(allocate, this.dataReferenceIndex);
        allocate.rewind();
        writableByteChannel.write(allocate);
        writableByteChannel.write(ByteBuffer.wrap(this.data));
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        int i = 8;
        long length = (long) (this.data.length + 8);
        if (this.largeBox || 8 + length >= 4294967296L) {
            i = 16;
        }
        return length + ((long) i);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = h7.l(allocate);
        byte[] bArr = new byte[rw.n(j - 8)];
        this.data = bArr;
        aVar.read(ByteBuffer.wrap(bArr));
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }
}
