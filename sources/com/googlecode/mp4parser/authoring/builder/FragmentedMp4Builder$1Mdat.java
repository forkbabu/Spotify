package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

class FragmentedMp4Builder$1Mdat implements a {
    b parent;
    long size_ = -1;
    final /* synthetic */ c this$0;
    private final /* synthetic */ long val$endSample;
    private final /* synthetic */ long val$startSample;
    private final /* synthetic */ x30 val$track;

    FragmentedMp4Builder$1Mdat(c cVar, long j, long j2, x30 x30) {
        this.val$startSample = j;
        this.val$endSample = j2;
        this.val$track = x30;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) ((long) rw.n(getSize())));
        allocate.put(ne.b(getType()));
        allocate.rewind();
        writableByteChannel.write(allocate);
        throw null;
    }

    public long getOffset() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // com.coremedia.iso.boxes.a
    public b getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long j = this.size_;
        if (j != -1) {
            return j;
        }
        throw null;
    }

    @Override // com.coremedia.iso.boxes.a
    public String getType() {
        return MediaDataBox.TYPE;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
    }

    @Override // com.coremedia.iso.boxes.a
    public void setParent(b bVar) {
        this.parent = bVar;
    }
}
