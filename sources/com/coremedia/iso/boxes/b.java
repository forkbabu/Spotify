package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface b {
    List<a> getBoxes();

    <T extends a> List<T> getBoxes(Class<T> cls);

    <T extends a> List<T> getBoxes(Class<T> cls, boolean z);

    ByteBuffer getByteBuffer(long j, long j2);

    void writeContainer(WritableByteChannel writableByteChannel);
}
