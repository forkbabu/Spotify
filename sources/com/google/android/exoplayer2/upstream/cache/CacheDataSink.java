package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink implements i {
    private final Cache a;
    private final long b;
    private final int c;
    private m d;
    private long e;
    private File f;
    private OutputStream g;
    private long h;
    private long i;
    private y j;

    public static class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j2, int i2) {
        g.n(j2 > 0 || j2 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j2 != -1) {
            int i3 = (j2 > 2097152 ? 1 : (j2 == 2097152 ? 0 : -1));
        }
        cache.getClass();
        this.a = cache;
        this.b = j2 == -1 ? Long.MAX_VALUE : j2;
        this.c = i2;
    }

    private void b() {
        OutputStream outputStream = this.g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                OutputStream outputStream2 = this.g;
                int i2 = f0.a;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                this.g = null;
                File file = this.f;
                this.f = null;
                this.a.i(file, this.h);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.g;
                int i3 = f0.a;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                this.g = null;
                File file2 = this.f;
                this.f = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void c() {
        long j2 = this.d.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = Math.min(j2 - this.i, this.e);
        }
        Cache cache = this.a;
        m mVar = this.d;
        this.f = cache.a(mVar.h, mVar.e + this.i, j3);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            y yVar = this.j;
            if (yVar == null) {
                this.j = new y(fileOutputStream, this.c);
            } else {
                yVar.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0;
    }

    @Override // com.google.android.exoplayer2.upstream.i
    public void a(m mVar) {
        if (mVar.g != -1 || !mVar.c(2)) {
            this.d = mVar;
            this.e = mVar.c(4) ? this.b : Long.MAX_VALUE;
            this.i = 0;
            try {
                c();
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        } else {
            this.d = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.i
    public void close() {
        if (this.d != null) {
            try {
                b();
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.i
    public void write(byte[] bArr, int i2, int i3) {
        if (this.d != null) {
            int i4 = 0;
            while (i4 < i3) {
                try {
                    if (this.h == this.e) {
                        b();
                        c();
                    }
                    int min = (int) Math.min((long) (i3 - i4), this.e - this.h);
                    this.g.write(bArr, i2 + i4, min);
                    i4 += min;
                    long j2 = (long) min;
                    this.h += j2;
                    this.i += j2;
                } catch (IOException e2) {
                    throw new CacheDataSinkException(e2);
                }
            }
        }
    }
}
