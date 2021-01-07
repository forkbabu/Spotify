package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzlo extends v4 {
    private static final Logger b = Logger.getLogger(zzlo.class.getName());
    private static final boolean c = f8.v();
    public static final /* synthetic */ int d = 0;
    h5 a;

    /* access modifiers changed from: package-private */
    public static class a extends zzlo {
        private final byte[] e;
        private final int f;
        private int g;

        a(byte[] bArr, int i) {
            super(null);
            if ((i | 0 | (bArr.length - i)) >= 0) {
                this.e = bArr;
                this.g = 0;
                this.f = i;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }

        private final void c0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void B(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void C(int i, long j) {
            j((i << 3) | 1);
            W(j);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void D(int i, String str) {
            j((i << 3) | 2);
            e0(str);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void J(int i, int i2) {
            j((i << 3) | 0);
            if (i2 >= 0) {
                j(i2);
            } else {
                S((long) i2);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void L(int i, int i2) {
            j((i << 3) | 0);
            j(i2);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final int N() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void O(int i, int i2) {
            j((i << 3) | 5);
            l(i2);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void S(long j) {
            if (!zzlo.c || N() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    f8.i(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                f8.i(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void W(long j) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.g = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.g = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.g = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.cast.v4
        public final void a(byte[] bArr, int i, int i2) {
            c0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void b(int i, int i2) {
            j((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void d(int i, long j) {
            j((i << 3) | 0);
            S(j);
        }

        public final void d0(zzlb zzlb) {
            j(zzlb.size());
            zzlb.d(this);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void e(int i, zzlb zzlb) {
            j((i << 3) | 2);
            d0(zzlb);
        }

        public final void e0(String str) {
            int i = this.g;
            try {
                int p = zzlo.p(str.length() * 3);
                int p2 = zzlo.p(str.length());
                if (p2 == p) {
                    int i2 = i + p2;
                    this.g = i2;
                    int b = j8.b(str, this.e, i2, N());
                    this.g = i;
                    j((b - i) - p2);
                    this.g = b;
                    return;
                }
                j(j8.a(str));
                this.g = j8.b(str, this.e, this.g, N());
            } catch (zzpg e2) {
                this.g = i;
                h(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void f(int i, z6 z6Var) {
            b(1, 3);
            L(2, i);
            b(3, 2);
            j(z6Var.e());
            z6Var.d(this);
            b(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.cast.zzlo
        public final void g(int i, z6 z6Var, m7 m7Var) {
            j((i << 3) | 2);
            q4 q4Var = (q4) z6Var;
            int h = q4Var.h();
            if (h == -1) {
                h = m7Var.c(q4Var);
                q4Var.g(h);
            }
            j(h);
            m7Var.f(z6Var, this.a);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void i(int i) {
            if (i >= 0) {
                j(i);
            } else {
                S((long) i);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void j(int i) {
            if (!zzlo.c || w4.a() || N() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                f8.i(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.e;
                int i5 = this.g;
                this.g = i5 + 1;
                f8.i(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.e;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    f8.i(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.e;
                int i8 = this.g;
                this.g = i8 + 1;
                f8.i(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    f8.i(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.e;
                int i11 = this.g;
                this.g = i11 + 1;
                f8.i(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.e;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    f8.i(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.e;
                int i14 = this.g;
                this.g = i14 + 1;
                f8.i(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.e;
                int i15 = this.g;
                this.g = i15 + 1;
                f8.i(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void l(int i) {
            try {
                byte[] bArr = this.e;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void u(int i, zzlb zzlb) {
            b(1, 3);
            L(2, i);
            e(3, zzlb);
            b(1, 4);
        }

        @Override // com.google.android.gms.internal.cast.zzlo
        public final void v(int i, boolean z) {
            j((i << 3) | 0);
            B(z ? (byte) 1 : 0);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzlo.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzlo() {
    }

    @Deprecated
    static int A(int i, z6 z6Var, m7 m7Var) {
        int p = p(i << 3) << 1;
        q4 q4Var = (q4) z6Var;
        int h = q4Var.h();
        if (h == -1) {
            h = m7Var.c(q4Var);
            q4Var.g(h);
        }
        return p + h;
    }

    public static int E(int i, long j) {
        return Z(j) + p(i << 3);
    }

    public static int F(int i, String str) {
        return n(str) + p(i << 3);
    }

    public static int G(int i, long j) {
        return Z(j) + p(i << 3);
    }

    public static int H(int i, long j) {
        return Z(b0(j)) + p(i << 3);
    }

    public static int I(int i) {
        return p(i << 3) + 8;
    }

    public static int K(int i) {
        return p(i << 3) + 8;
    }

    public static int Q(int i, int i2) {
        return o(i2) + p(i << 3);
    }

    public static int R(int i, int i2) {
        return p(i2) + p(i << 3);
    }

    public static int T(int i, int i2) {
        return p(w(i2)) + p(i << 3);
    }

    public static int V(int i) {
        return p(i << 3) + 4;
    }

    public static int X(int i) {
        return p(i << 3) + 4;
    }

    public static int Y(int i, int i2) {
        return o(i2) + p(i << 3);
    }

    public static int Z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int a0(long j) {
        return Z(b0(j));
    }

    private static long b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    static int c(z6 z6Var, m7 m7Var) {
        q4 q4Var = (q4) z6Var;
        int h = q4Var.h();
        if (h == -1) {
            h = m7Var.c(q4Var);
            q4Var.g(h);
        }
        return p(h) + h;
    }

    public static int m(int i) {
        return p(i << 3);
    }

    public static int n(String str) {
        int i;
        try {
            i = j8.a(str);
        } catch (zzpg unused) {
            i = str.getBytes(v5.a).length;
        }
        return p(i) + i;
    }

    public static int o(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int p(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int q(int i) {
        return p(w(i));
    }

    public static int r(int i) {
        return p(i << 3) + 4;
    }

    public static int s(zzlb zzlb) {
        int size = zzlb.size();
        return p(size) + size;
    }

    private static int w(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int x(int i) {
        return p(i << 3) + 8;
    }

    public static int y(int i) {
        return p(i << 3) + 1;
    }

    public static int z(int i, zzlb zzlb) {
        int p = p(i << 3);
        int size = zzlb.size();
        return p(size) + size + p;
    }

    public abstract void B(byte b2);

    public abstract void C(int i, long j);

    public abstract void D(int i, String str);

    public abstract void J(int i, int i2);

    public abstract void L(int i, int i2);

    public final void M(int i, int i2) {
        L(i, w(i2));
    }

    public abstract int N();

    public abstract void O(int i, int i2);

    public abstract void S(long j);

    public final void U(long j) {
        S(b0(j));
    }

    public abstract void W(long j);

    public abstract void b(int i, int i2);

    public abstract void d(int i, long j);

    public abstract void e(int i, zzlb zzlb);

    public abstract void f(int i, z6 z6Var);

    /* access modifiers changed from: package-private */
    public abstract void g(int i, z6 z6Var, m7 m7Var);

    /* access modifiers changed from: package-private */
    public final void h(String str, zzpg zzpg) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpg);
        byte[] bytes = str.getBytes(v5.a);
        try {
            j(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    public abstract void i(int i);

    public abstract void j(int i);

    public final void k(int i) {
        j(w(i));
    }

    public abstract void l(int i);

    public final void t(int i, long j) {
        d(i, b0(j));
    }

    public abstract void u(int i, zzlb zzlb);

    public abstract void v(int i, boolean z);

    zzlo(g5 g5Var) {
    }
}
