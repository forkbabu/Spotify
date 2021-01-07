package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.g;
import java.io.InputStream;

public final class l extends InputStream {
    private final k a;
    private final m b;
    private final byte[] c;
    private boolean f = false;
    private boolean n = false;
    private long o;

    public l(k kVar, m mVar) {
        this.a = kVar;
        this.b = mVar;
        this.c = new byte[1];
    }

    public void a() {
        if (!this.f) {
            this.a.a(this.b);
            this.f = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.n) {
            this.a.close();
            this.n = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        g.m(!this.n);
        if (!this.f) {
            this.a.a(this.b);
            this.f = true;
        }
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.o += (long) read;
        return read;
    }
}
