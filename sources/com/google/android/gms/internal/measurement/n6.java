package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class n6 {
    private static final n6 f = new n6(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private n6() {
        this(0, new int[8], new Object[8], true);
    }

    public static n6 a() {
        return f;
    }

    static n6 b(n6 n6Var, n6 n6Var2) {
        int i = n6Var.a + n6Var2.a;
        int[] copyOf = Arrays.copyOf(n6Var.b, i);
        System.arraycopy(n6Var2.b, 0, copyOf, n6Var.a, n6Var2.a);
        Object[] copyOf2 = Arrays.copyOf(n6Var.c, i);
        System.arraycopy(n6Var2.c, 0, copyOf2, n6Var.a, n6Var2.a);
        return new n6(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, z6 z6Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((t3) z6Var).f(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ((t3) z6Var).z(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ((t3) z6Var).g(i2, (zzgm) obj);
        } else if (i3 == 3) {
            t3 t3Var = (t3) z6Var;
            t3Var.b(i2);
            ((n6) obj).h(z6Var);
            t3Var.p(i2);
        } else if (i3 == 5) {
            ((t3) z6Var).y(i2, ((Integer) obj).intValue());
        } else {
            int i4 = zzig.a;
            throw new RuntimeException(new zzif("Protocol message tag had invalid wire type."));
        }
    }

    static n6 g() {
        return new n6(0, new int[8], new Object[8], true);
    }

    /* access modifiers changed from: package-private */
    public final void c(int i, Object obj) {
        if (this.e) {
            int i2 = this.a;
            int[] iArr = this.b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.b = Arrays.copyOf(iArr, i3);
                this.c = Arrays.copyOf(this.c, i3);
            }
            int[] iArr2 = this.b;
            int i4 = this.a;
            iArr2[i4] = i;
            this.c[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void e(z6 z6Var) {
        z6Var.getClass();
        for (int i = 0; i < this.a; i++) {
            ((t3) z6Var).i(this.b[i] >>> 3, this.c[i]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        int i = this.a;
        if (i == n6Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = n6Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = n6Var.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            o2.s(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void h(z6 z6Var) {
        if (this.a != 0) {
            z6Var.getClass();
            for (int i = 0; i < this.a; i++) {
                d(this.b[i], this.c[i], z6Var);
            }
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void i() {
        this.e = false;
    }

    public final int j() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int T = zzhf.T(2, this.b[i3] >>> 3);
            i2 += zzhf.A(3, (zzgm) this.c[i3]) + T + (zzhf.S(8) << 1);
        }
        this.d = i2;
        return i2;
    }

    public final int k() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzhf.L(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.c[i4]).longValue();
                i = zzhf.U(i6);
            } else if (i7 == 2) {
                i = zzhf.A(i6, (zzgm) this.c[i4]);
            } else if (i7 == 3) {
                i3 = ((n6) this.c[i4]).k() + (zzhf.K(i6) << 1) + i3;
            } else if (i7 == 5) {
                ((Integer) this.c[i4]).intValue();
                i = zzhf.Z(i6);
            } else {
                int i8 = zzig.a;
                throw new IllegalStateException(new zzif("Protocol message tag had invalid wire type."));
            }
            i3 = i + i3;
        }
        this.d = i3;
        return i3;
    }

    private n6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
