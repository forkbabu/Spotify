package defpackage;

import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.util.f0;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: nj  reason: default package */
public final class nj {
    private final byte[] a = new byte[4096];
    private final k b;
    private final long c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public nj(k kVar, long j, long j2) {
        this.b = kVar;
        this.d = j;
        this.c = j2;
    }

    private void b(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    private int h(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private void m(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    public boolean a(int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, f0.h(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
        int i3 = this.g - this.f;
        while (i3 < i) {
            i3 = h(this.e, this.f, i, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.g = this.f + i3;
        }
        this.f += i;
        return true;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d + ((long) this.f);
    }

    public long e() {
        return this.d;
    }

    public boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public int g(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            m(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = h(bArr, i, i2, 0, true);
        }
        b(i4);
        return i4;
    }

    public boolean i(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.e, 0, bArr, i, i3);
            m(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = h(bArr, i, i2, i5, z);
        }
        b(i5);
        if (i5 != -1) {
            return true;
        }
        return false;
    }

    public void j() {
        this.f = 0;
    }

    public int k(int i) {
        int min = Math.min(this.g, i);
        m(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = h(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        b(min);
        return min;
    }

    public void l(int i) {
        int min = Math.min(this.g, i);
        m(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = h(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        b(i2);
    }
}
