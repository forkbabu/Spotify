package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzhf extends h3 {
    private static final Logger b = Logger.getLogger(zzhf.class.getName());
    private static final boolean c = q6.l();
    public static final /* synthetic */ int d = 0;
    t3 a;

    /* access modifiers changed from: package-private */
    public static class a extends zzhf {
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

        private final void g0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void D(int i, int i2) {
            t((i << 3) | 0);
            t(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void E(int i, long j) {
            t((i << 3) | 1);
            F(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void F(long j) {
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
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void I(int i) {
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
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void N(int i, int i2) {
            t((i << 3) | 5);
            I(i2);
        }

        @Override // com.google.android.gms.internal.measurement.h3
        public final void a(byte[] bArr, int i, int i2) {
            g0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final int b() {
            return this.f - this.g;
        }

        public final void d0(zzgm zzgm) {
            t(zzgm.d());
            zzgm.j(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void e(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
            }
        }

        public final void e0(l5 l5Var) {
            t(l5Var.c());
            l5Var.f(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void f(int i) {
            if (i >= 0) {
                t(i);
            } else {
                n((long) i);
            }
        }

        public final void f0(String str) {
            int i = this.g;
            try {
                int S = zzhf.S(str.length() * 3);
                int S2 = zzhf.S(str.length());
                if (S2 == S) {
                    int i2 = i + S2;
                    this.g = i2;
                    int c = t6.c(str, this.e, i2, b());
                    this.g = i;
                    t((c - i) - S2);
                    this.g = c;
                    return;
                }
                t(t6.b(str));
                this.g = t6.c(str, this.e, this.g, b());
            } catch (zzkz e2) {
                this.g = i;
                o(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zza(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void g(int i, int i2) {
            t((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void h(int i, long j) {
            t((i << 3) | 0);
            n(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void i(int i, zzgm zzgm) {
            t((i << 3) | 2);
            d0(zzgm);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void j(int i, l5 l5Var) {
            g(1, 3);
            D(2, i);
            g(3, 2);
            e0(l5Var);
            g(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void k(int i, l5 l5Var, y5 y5Var) {
            t((i << 3) | 2);
            z2 z2Var = (z2) l5Var;
            int k = z2Var.k();
            if (k == -1) {
                k = y5Var.c(z2Var);
                z2Var.l(k);
            }
            t(k);
            y5Var.i(l5Var, this.a);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void l(int i, String str) {
            t((i << 3) | 2);
            f0(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void m(int i, boolean z) {
            t((i << 3) | 0);
            e(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void n(long j) {
            if (!zzhf.c || b() < 10) {
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
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    q6.k(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                q6.k(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void t(int i) {
            if (!zzhf.c || e3.a() || b() < 5) {
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
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                q6.k(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.e;
                int i5 = this.g;
                this.g = i5 + 1;
                q6.k(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.e;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    q6.k(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.e;
                int i8 = this.g;
                this.g = i8 + 1;
                q6.k(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    q6.k(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.e;
                int i11 = this.g;
                this.g = i11 + 1;
                q6.k(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.e;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    q6.k(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.e;
                int i14 = this.g;
                this.g = i14 + 1;
                q6.k(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.e;
                int i15 = this.g;
                this.g = i15 + 1;
                q6.k(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void u(int i, int i2) {
            t((i << 3) | 0);
            if (i2 >= 0) {
                t(i2);
            } else {
                n((long) i2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhf
        public final void w(int i, zzgm zzgm) {
            g(1, 3);
            D(2, i);
            i(3, zzgm);
            g(1, 4);
        }
    }

    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhf.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzhf() {
    }

    public static int A(int i, zzgm zzgm) {
        int S = S(i << 3);
        int d2 = zzgm.d();
        return S(d2) + d2 + S;
    }

    @Deprecated
    static int B(int i, l5 l5Var, y5 y5Var) {
        int S = S(i << 3) << 1;
        z2 z2Var = (z2) l5Var;
        int k = z2Var.k();
        if (k == -1) {
            k = y5Var.c(z2Var);
            z2Var.l(k);
        }
        return S + k;
    }

    public static int H(int i, long j) {
        return M(j) + S(i << 3);
    }

    public static int K(int i) {
        return S(i << 3);
    }

    public static int L(int i, long j) {
        return M(j) + S(i << 3);
    }

    public static int M(long j) {
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

    public static int O(int i) {
        if (i >= 0) {
            return S(i);
        }
        return 10;
    }

    public static int P(int i, int i2) {
        return O(i2) + S(i << 3);
    }

    public static int Q(int i, long j) {
        return M(Y(j)) + S(i << 3);
    }

    public static int R(long j) {
        return M(Y(j));
    }

    public static int S(int i) {
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

    public static int T(int i, int i2) {
        return S(i2) + S(i << 3);
    }

    public static int U(int i) {
        return S(i << 3) + 8;
    }

    public static int V(int i) {
        return S(c0(i));
    }

    public static int W(int i, int i2) {
        return S(c0(i2)) + S(i << 3);
    }

    public static int X(int i) {
        return S(i << 3) + 8;
    }

    private static long Y(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int Z(int i) {
        return S(i << 3) + 4;
    }

    public static int a0(int i) {
        return S(i << 3) + 4;
    }

    public static int b0(int i, int i2) {
        return O(i2) + S(i << 3);
    }

    public static int c(r4 r4Var) {
        int b2 = r4Var.b();
        return S(b2) + b2;
    }

    private static int c0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    static int d(l5 l5Var, y5 y5Var) {
        z2 z2Var = (z2) l5Var;
        int k = z2Var.k();
        if (k == -1) {
            k = y5Var.c(z2Var);
            z2Var.l(k);
        }
        return S(k) + k;
    }

    public static int p(int i) {
        return S(i << 3) + 4;
    }

    public static int q(int i, String str) {
        return s(str) + S(i << 3);
    }

    public static int r(zzgm zzgm) {
        int d2 = zzgm.d();
        return S(d2) + d2;
    }

    public static int s(String str) {
        int i;
        try {
            i = t6.b(str);
        } catch (zzkz unused) {
            i = str.getBytes(h4.a).length;
        }
        return S(i) + i;
    }

    public static int y(int i) {
        return S(i << 3) + 8;
    }

    public static int z(int i) {
        return S(i << 3) + 1;
    }

    public final void C(int i) {
        t(c0(i));
    }

    public abstract void D(int i, int i2);

    public abstract void E(int i, long j);

    public abstract void F(long j);

    public abstract void I(int i);

    public final void J(int i, int i2) {
        D(i, c0(i2));
    }

    public abstract void N(int i, int i2);

    public abstract int b();

    public abstract void e(byte b2);

    public abstract void f(int i);

    public abstract void g(int i, int i2);

    public abstract void h(int i, long j);

    public abstract void i(int i, zzgm zzgm);

    public abstract void j(int i, l5 l5Var);

    /* access modifiers changed from: package-private */
    public abstract void k(int i, l5 l5Var, y5 y5Var);

    public abstract void l(int i, String str);

    public abstract void m(int i, boolean z);

    public abstract void n(long j);

    /* access modifiers changed from: package-private */
    public final void o(String str, zzkz zzkz) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzkz);
        byte[] bytes = str.getBytes(h4.a);
        try {
            t(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zza(e);
        } catch (zza e2) {
            throw e2;
        }
    }

    public abstract void t(int i);

    public abstract void u(int i, int i2);

    public final void v(int i, long j) {
        h(i, Y(j));
    }

    public abstract void w(int i, zzgm zzgm);

    public final void x(long j) {
        n(Y(j));
    }

    zzhf(r3 r3Var) {
    }
}
