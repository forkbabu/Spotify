package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface FullBox extends a {
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel);

    int getFlags();

    /* synthetic */ long getOffset();

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ b getParent();

    /* synthetic */ long getSize();

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ String getType();

    int getVersion();

    /* synthetic */ void parse(a aVar, ByteBuffer byteBuffer, long j, le leVar);

    void setFlags(int i);

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ void setParent(b bVar);

    void setVersion(int i);
}
