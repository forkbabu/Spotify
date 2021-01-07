package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface SampleEntry extends a, b {
    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void getBox(WritableByteChannel writableByteChannel);

    @Override // com.coremedia.iso.boxes.b
    /* synthetic */ List<a> getBoxes();

    @Override // com.coremedia.iso.boxes.b
    /* synthetic */ <T extends a> List<T> getBoxes(Class<T> cls);

    @Override // com.coremedia.iso.boxes.b
    /* synthetic */ <T extends a> List<T> getBoxes(Class<T> cls, boolean z);

    @Override // com.coremedia.iso.boxes.b
    /* synthetic */ ByteBuffer getByteBuffer(long j, long j2);

    int getDataReferenceIndex();

    /* synthetic */ long getOffset();

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ b getParent();

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    /* synthetic */ long getSize();

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ String getType();

    @Override // com.coremedia.iso.boxes.a, com.coremedia.iso.boxes.FullBox
    /* synthetic */ void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j, le leVar);

    /* synthetic */ void setBoxes(List<a> list);

    void setDataReferenceIndex(int i);

    @Override // com.coremedia.iso.boxes.a
    /* synthetic */ void setParent(b bVar);

    @Override // com.coremedia.iso.boxes.b
    /* synthetic */ void writeContainer(WritableByteChannel writableByteChannel);
}
