package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface a extends Closeable {
    ByteBuffer K1(long j, long j2);

    long Z();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void position(long j);

    int read(ByteBuffer byteBuffer);

    long size();

    long u(long j, long j2, WritableByteChannel writableByteChannel);
}
