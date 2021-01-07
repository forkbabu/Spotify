package com.googlecode.mp4parser;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class b implements a {
    private static j50 c = j50.a(b.class);
    FileChannel a;
    String b;

    public b(File file) {
        this.a = new FileInputStream(file).getChannel();
        this.b = file.getName();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized ByteBuffer K1(long j, long j2) {
        j50 j50 = c;
        j50.b(String.valueOf(j) + " " + j2);
        return this.a.map(FileChannel.MapMode.READ_ONLY, j, j2);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long Z() {
        return this.a.position();
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized void position(long j) {
        this.a.position(j);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long size() {
        return this.a.size();
    }

    @Override // java.lang.Object
    public String toString() {
        return this.b;
    }

    @Override // com.googlecode.mp4parser.a
    public synchronized long u(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.a.transferTo(j, j2, writableByteChannel);
    }
}
