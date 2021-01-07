package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class MediaDataBox implements a {
    public static final String TYPE = "mdat";
    private com.googlecode.mp4parser.a dataSource;
    private long offset;
    b parent;
    private long size;

    private static void transfer(com.googlecode.mp4parser.a aVar, long j, long j2, WritableByteChannel writableByteChannel) {
        long j3 = 0;
        while (j3 < j2) {
            j3 += aVar.u(j + j3, Math.min(67076096L, j2 - j3), writableByteChannel);
        }
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
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
        return this.size;
    }

    @Override // com.coremedia.iso.boxes.a
    public String getType() {
        return TYPE;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        this.offset = aVar.Z() - ((long) byteBuffer.remaining());
        this.dataSource = aVar;
        this.size = ((long) byteBuffer.remaining()) + j;
        aVar.position(aVar.Z() + j);
    }

    @Override // com.coremedia.iso.boxes.a
    public void setParent(b bVar) {
        this.parent = bVar;
    }

    public String toString() {
        return je.D0(new StringBuilder("MediaDataBox{size="), this.size, '}');
    }
}
