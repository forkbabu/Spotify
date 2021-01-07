package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class u extends InputStream {
    private final InputStream a;
    private long b;
    private long c;
    private long f;
    private long n = -1;
    private boolean o = true;
    private int p = -1;

    u(InputStream inputStream) {
        this.a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        this.p = 1024;
    }

    private void f(long j) {
        try {
            long j2 = this.c;
            long j3 = this.b;
            if (j2 >= j3 || j3 > this.f) {
                this.c = j3;
                this.a.mark((int) (j - j3));
            } else {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                g(this.c, this.b);
            }
            this.f = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void g(long j, long j2) {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public void a(boolean z) {
        this.o = z;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    public void b(long j) {
        if (this.b > this.f || j < this.c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        g(this.c, j);
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public long d(int i) {
        long j = this.b + ((long) i);
        if (this.f < j) {
            f(j);
        }
        return this.b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        long j = this.b + ((long) i);
        if (this.f < j) {
            f(j);
        }
        this.n = this.b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.o) {
            long j = this.f;
            if (this.b + 1 > j) {
                f(j + ((long) this.p));
            }
        }
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.n);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (!this.o) {
            long j2 = this.b;
            if (j2 + j > this.f) {
                f(j2 + j + ((long) this.p));
            }
        }
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.o) {
            long j = this.b;
            if (((long) bArr.length) + j > this.f) {
                f(j + ((long) bArr.length) + ((long) this.p));
            }
        }
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (!this.o) {
            long j = this.b;
            long j2 = (long) i2;
            if (j + j2 > this.f) {
                f(j + j2 + ((long) this.p));
            }
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
