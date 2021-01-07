package com.mp4parser.streaming;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class WriteOnlyBox implements a {
    private b parent;
    private final String type;

    public WriteOnlyBox(String str) {
        this.type = str;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public abstract /* synthetic */ void getBox(WritableByteChannel writableByteChannel);

    public long getOffset() {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // com.coremedia.iso.boxes.a
    public b getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public abstract /* synthetic */ long getSize();

    @Override // com.coremedia.iso.boxes.a
    public String getType() {
        return this.type;
    }

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar) {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // com.coremedia.iso.boxes.a
    public void setParent(b bVar) {
        this.parent = bVar;
    }
}
