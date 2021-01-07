package com.googlecode.mp4parser;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class c implements a {
    ByteBuffer a;

    public c(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.googlecode.mp4parser.a
    public ByteBuffer K1(long j, long j2) {
        int position = this.a.position();
        this.a.position(rw.n(j));
        ByteBuffer slice = this.a.slice();
        slice.limit(rw.n(j2));
        this.a.position(position);
        return slice;
    }

    @Override // com.googlecode.mp4parser.a
    public long Z() {
        return (long) this.a.position();
    }

    @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.googlecode.mp4parser.a
    public void position(long j) {
        this.a.position(rw.n(j));
    }

    @Override // com.googlecode.mp4parser.a
    public int read(ByteBuffer byteBuffer) {
        if (this.a.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.a.remaining());
        if (byteBuffer.hasArray()) {
            byteBuffer.put(this.a.array(), this.a.position(), min);
            ByteBuffer byteBuffer2 = this.a;
            byteBuffer2.position(byteBuffer2.position() + min);
        } else {
            byte[] bArr = new byte[min];
            this.a.get(bArr);
            byteBuffer.put(bArr);
        }
        return min;
    }

    @Override // com.googlecode.mp4parser.a
    public long size() {
        return (long) this.a.capacity();
    }

    @Override // com.googlecode.mp4parser.a
    public long u(long j, long j2, WritableByteChannel writableByteChannel) {
        return (long) writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.a.position(rw.n(j))).slice().limit(rw.n(j2)));
    }
}
