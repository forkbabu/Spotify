package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface a {
    @Override // com.coremedia.iso.boxes.FullBox
    void getBox(WritableByteChannel writableByteChannel);

    b getParent();

    @Override // com.coremedia.iso.boxes.FullBox
    long getSize();

    String getType();

    @Override // com.coremedia.iso.boxes.FullBox
    void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar);

    void setParent(b bVar);
}
