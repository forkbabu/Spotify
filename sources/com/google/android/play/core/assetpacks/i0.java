package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class i0 extends FilterInputStream {
    private final u1 a = new u1();
    private byte[] b = new byte[4096];
    private long c;
    private boolean f = false;
    private boolean n = false;

    i0(InputStream inputStream) {
        super(inputStream);
    }

    private final int a(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    private final boolean d(int i) {
        int a2 = a(this.b, 0, i);
        if (a2 != i) {
            int i2 = i - a2;
            if (a(this.b, a2, i2) != i2) {
                this.a.b(this.b, 0, a2);
                return false;
            }
        }
        this.a.b(this.b, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final o2 b() {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f || this.n) {
            return new o2(null, -1, -1, false, false, null);
        }
        if (!d(30)) {
            this.f = true;
            return this.a.c();
        }
        o2 c2 = this.a.c();
        if (c2.g()) {
            this.n = true;
            return c2;
        } else if (c2.d() != 4294967295L) {
            int d = this.a.d() - 30;
            long j = (long) d;
            int length = this.b.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.b = Arrays.copyOf(this.b, length);
            }
            if (!d(d)) {
                this.f = true;
                return this.a.c();
            }
            o2 c3 = this.a.c();
            this.c = c3.d();
            return c3;
        } else {
            throw new bv("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final long h() {
        return this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j <= 0 || this.f) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.c -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f = true;
        return 0;
    }
}
