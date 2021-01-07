package io.netty.buffer;

/* access modifiers changed from: package-private */
public final class v<T> {
    final t<T> a;
    private final int b;
    private final int c;
    private final int d;
    private final long[] e;
    v<T> f;
    v<T> g;
    boolean h;
    int i;
    private int j;
    private int k;
    private int l;
    private int m;

    v(int i2) {
        this.a = null;
        this.b = -1;
        this.c = -1;
        this.i = -1;
        this.d = i2;
        this.e = null;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        long j2;
        int i2;
        int i3 = 0;
        if (this.i == 0) {
            j2 = (((long) 0) << 32) | 4611686018427387904L;
            i2 = this.b;
        } else if (this.m == 0 || !this.h) {
            return -1;
        } else {
            int i4 = this.l;
            if (i4 >= 0) {
                this.l = -1;
            } else {
                long[] jArr = this.e;
                int i5 = this.k;
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        break;
                    }
                    long j3 = jArr[i6];
                    if ((j3 ^ -1) != 0) {
                        int i7 = this.j;
                        int i8 = i6 << 6;
                        while (true) {
                            if (i3 >= 64) {
                                break;
                            } else if ((j3 & 1) == 0) {
                                int i9 = i3 | i8;
                                if (i9 < i7) {
                                    i4 = i9;
                                }
                            } else {
                                j3 >>>= 1;
                                i3++;
                            }
                        }
                    } else {
                        i6++;
                    }
                }
                i4 = -1;
            }
            int i10 = i4 >>> 6;
            long[] jArr2 = this.e;
            jArr2[i10] = (1 << (i4 & 63)) | jArr2[i10];
            int i11 = this.m - 1;
            this.m = i11;
            if (i11 == 0) {
                v<T> vVar = this.f;
                vVar.g = this.g;
                this.g.f = vVar;
                this.g = null;
                this.f = null;
            }
            j2 = (((long) i4) << 32) | 4611686018427387904L;
            i2 = this.b;
        }
        return j2 | ((long) i2);
    }

    /* access modifiers changed from: package-private */
    public boolean b(v<T> vVar, int i2) {
        v<T> vVar2;
        v<T> vVar3;
        if (this.i == 0) {
            return true;
        }
        int i3 = i2 >>> 6;
        long[] jArr = this.e;
        jArr[i3] = jArr[i3] ^ (1 << (i2 & 63));
        this.l = i2;
        int i4 = this.m;
        int i5 = i4 + 1;
        this.m = i5;
        if (i4 == 0) {
            this.f = vVar;
            v<T> vVar4 = vVar.g;
            this.g = vVar4;
            vVar4.f = this;
            vVar.g = this;
            return true;
        } else if (i5 != this.j || (vVar2 = this.f) == (vVar3 = this.g)) {
            return true;
        } else {
            this.h = false;
            vVar2.g = vVar3;
            this.g.f = vVar2;
            this.g = null;
            this.f = null;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(v<T> vVar, int i2) {
        this.h = true;
        this.i = i2;
        if (i2 != 0) {
            int i3 = this.d / i2;
            this.m = i3;
            this.j = i3;
            this.l = 0;
            int i4 = i3 >>> 6;
            this.k = i4;
            if ((i3 & 63) != 0) {
                this.k = i4 + 1;
            }
            for (int i5 = 0; i5 < this.k; i5++) {
                this.e[i5] = 0;
            }
        }
        this.f = vVar;
        v<T> vVar2 = vVar.g;
        this.g = vVar2;
        vVar2.f = this;
        vVar.g = this;
    }

    public String toString() {
        if (!this.h) {
            return je.B0(je.V0("("), this.b, ": not in use)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf('('));
        sb.append(this.b);
        sb.append(": ");
        sb.append(this.j - this.m);
        sb.append('/');
        sb.append(this.j);
        sb.append(", offset: ");
        sb.append(this.c);
        sb.append(", length: ");
        sb.append(this.d);
        sb.append(", elemSize: ");
        return je.A0(sb, this.i, ')');
    }

    v(v<T> vVar, t<T> tVar, int i2, int i3, int i4, int i5) {
        this.a = tVar;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = new long[(i4 >>> 10)];
        c(vVar, i5);
    }
}
