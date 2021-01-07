package io.netty.buffer;

/* access modifiers changed from: package-private */
public final class t<T> {
    final PoolArena<T> a;
    final T b;
    final boolean c = true;
    private final byte[] d;
    private final byte[] e;
    private final v<T>[] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final byte n;
    private int o;
    u<T> p;
    t<T> q;
    t<T> r;

    t(PoolArena<T> poolArena, T t, int i2, int i3, int i4, int i5) {
        this.a = poolArena;
        this.b = t;
        this.h = i2;
        this.i = i4;
        this.j = i3;
        this.k = i5;
        this.n = (byte) (i3 + 1);
        this.l = i(i5);
        this.g = (i2 - 1) ^ -1;
        this.o = i5;
        int i6 = 1 << i3;
        this.m = i6;
        int i7 = i6 << 1;
        this.d = new byte[i7];
        this.e = new byte[i7];
        int i8 = 1;
        for (int i9 = 0; i9 <= i3; i9++) {
            int i10 = 1 << i9;
            for (int i11 = 0; i11 < i10; i11++) {
                byte b2 = (byte) i9;
                this.d[i8] = b2;
                this.e[i8] = b2;
                i8++;
            }
        }
        this.f = new v[this.m];
    }

    private int b(int i2) {
        int i3 = -(1 << i2);
        byte b2 = this.d[1];
        if (b2 > i2) {
            return -1;
        }
        int i4 = 1;
        while (true) {
            if (b2 >= i2 && (i4 & i3) != 0) {
                break;
            }
            i4 <<= 1;
            byte[] bArr = this.d;
            byte b3 = bArr[i4];
            if (b3 > i2) {
                i4 ^= 1;
                b2 = bArr[i4];
            } else {
                b2 = b3;
            }
        }
        byte[] bArr2 = this.d;
        byte b4 = bArr2[i4];
        bArr2[i4] = this.n;
        int i5 = i4;
        while (i5 > 1) {
            int i6 = i5 >>> 1;
            byte[] bArr3 = this.d;
            byte b5 = bArr3[i5];
            byte b6 = bArr3[i5 ^ 1];
            if (b5 >= b6) {
                b5 = b6;
            }
            bArr3[i6] = b5;
            i5 = i6;
        }
        return i4;
    }

    private static int c(long j2) {
        return (int) (j2 >>> 32);
    }

    private void h(x<T> xVar, long j2, int i2, int i3) {
        int i4 = (int) j2;
        v<T> vVar = this.f[this.m ^ i4];
        int k2 = k(i4);
        int i5 = vVar.i;
        xVar.C2(this, j2, ((i2 & 1073741823) * i5) + k2, i3, i5, this.a.a.z());
    }

    private static int i(int i2) {
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    private int j(int i2) {
        return 1 << (this.l - this.e[i2]);
    }

    private int k(int i2) {
        byte[] bArr = this.e;
        return ((1 << bArr[i2]) ^ i2) * (1 << (this.l - bArr[i2]));
    }

    /* access modifiers changed from: package-private */
    public long a(int i2) {
        long j2;
        if ((this.g & i2) != 0) {
            int b2 = b(this.j - (i(i2) - this.i));
            if (b2 >= 0) {
                this.o -= j(b2);
            }
            return (long) b2;
        }
        v<T> g2 = this.a.g(i2);
        synchronized (g2) {
            int b3 = b(this.j);
            if (b3 < 0) {
                j2 = (long) b3;
            } else {
                v<T>[] vVarArr = this.f;
                int i3 = this.h;
                this.o -= i3;
                int i4 = b3 ^ this.m;
                v<T> vVar = vVarArr[i4];
                if (vVar == null) {
                    v<T> vVar2 = new v<>(g2, this, b3, k(b3), i3, i2);
                    vVarArr[i4] = vVar2;
                    vVar = vVar2;
                } else {
                    vVar.c(g2, i2);
                }
                j2 = vVar.a();
            }
        }
        return j2;
    }

    public int d() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void e(long j2) {
        int i2 = (int) j2;
        int c2 = c(j2);
        if (c2 != 0) {
            v<T> vVar = this.f[this.m ^ i2];
            v<T> g2 = this.a.g(vVar.i);
            synchronized (g2) {
                if (vVar.b(g2, c2 & 1073741823)) {
                    return;
                }
            }
        }
        this.o += j(i2);
        byte[] bArr = this.e;
        this.d[i2] = bArr[i2];
        int i3 = bArr[i2] + 1;
        while (i2 > 1) {
            int i4 = i2 >>> 1;
            byte[] bArr2 = this.d;
            byte b2 = bArr2[i2];
            byte b3 = bArr2[i2 ^ 1];
            i3--;
            if (b2 == i3 && b3 == i3) {
                bArr2[i4] = (byte) (i3 - 1);
            } else {
                if (b2 >= b3) {
                    b2 = b3;
                }
                bArr2[i4] = b2;
            }
            i2 = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(x<T> xVar, long j2, int i2) {
        int i3 = (int) j2;
        int c2 = c(j2);
        if (c2 == 0) {
            byte b2 = this.d[i3];
            xVar.C2(this, j2, k(i3), i2, j(i3), this.a.a.z());
            return;
        }
        h(xVar, j2, c2, i2);
    }

    /* access modifiers changed from: package-private */
    public void g(x<T> xVar, long j2, int i2) {
        h(xVar, j2, c(j2), i2);
    }

    public int l() {
        int i2 = this.o;
        if (i2 == 0) {
            return 100;
        }
        int i3 = (int) ((((long) i2) * 100) / ((long) this.k));
        if (i3 == 0) {
            return 99;
        }
        return 100 - i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Chunk(");
        V0.append(Integer.toHexString(System.identityHashCode(this)));
        V0.append(": ");
        V0.append(l());
        V0.append("%, ");
        V0.append(this.k - this.o);
        V0.append('/');
        return je.A0(V0, this.k, ')');
    }

    t(PoolArena<T> poolArena, T t, int i2) {
        this.a = poolArena;
        this.b = t;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.n = (byte) 1;
        this.k = i2;
        this.l = i(i2);
        this.m = 0;
    }
}
