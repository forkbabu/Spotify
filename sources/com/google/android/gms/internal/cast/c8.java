package com.google.android.gms.internal.cast;

import java.util.Arrays;

public final class c8 {
    private static final c8 e = new c8(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;

    private c8() {
        this(0, new int[8], new Object[8], true);
    }

    static c8 a(c8 c8Var, c8 c8Var2) {
        int i = c8Var.a + c8Var2.a;
        int[] copyOf = Arrays.copyOf(c8Var.b, i);
        System.arraycopy(c8Var2.b, 0, copyOf, c8Var.a, c8Var2.a);
        Object[] copyOf2 = Arrays.copyOf(c8Var.c, i);
        System.arraycopy(c8Var2.c, 0, copyOf2, c8Var.a, c8Var2.a);
        return new c8(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, o8 o8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ((h5) o8Var).D(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ((h5) o8Var).s(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ((h5) o8Var).e(i2, (zzlb) obj);
        } else if (i3 == 3) {
            h5 h5Var = (h5) o8Var;
            h5Var.q(i2);
            ((c8) obj).e(o8Var);
            h5Var.r(i2);
        } else if (i3 == 5) {
            ((h5) o8Var).F(i2, ((Integer) obj).intValue());
        } else {
            int i4 = zzmo.a;
            throw new RuntimeException(new zzmn("Protocol message tag had invalid wire type."));
        }
    }

    public static c8 g() {
        return e;
    }

    /* access modifiers changed from: package-private */
    public final void b(o8 o8Var) {
        o8Var.getClass();
        for (int i = 0; i < this.a; i++) {
            ((h5) o8Var).l(this.b[i] >>> 3, this.c[i]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            s.e(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void e(o8 o8Var) {
        if (this.a != 0) {
            o8Var.getClass();
            for (int i = 0; i < this.a; i++) {
                d(this.b[i], this.c[i], o8Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        int i = this.a;
        if (i == c8Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = c8Var.b;
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
                Object[] objArr2 = c8Var.c;
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

    public final int f() {
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
                i = zzlo.G(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.c[i4]).longValue();
                i = zzlo.I(i6);
            } else if (i7 == 2) {
                i = zzlo.z(i6, (zzlb) this.c[i4]);
            } else if (i7 == 3) {
                i3 = ((c8) this.c[i4]).f() + (zzlo.m(i6) << 1) + i3;
            } else if (i7 == 5) {
                ((Integer) this.c[i4]).intValue();
                i = zzlo.V(i6);
            } else {
                int i8 = zzmo.a;
                throw new IllegalStateException(new zzmn("Protocol message tag had invalid wire type."));
            }
            i3 = i + i3;
        }
        this.d = i3;
        return i3;
    }

    public final int h() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int R = zzlo.R(2, this.b[i3] >>> 3);
            i2 += zzlo.z(3, (zzlb) this.c[i3]) + R + (zzlo.p(8) << 1);
        }
        this.d = i2;
        return i2;
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

    private c8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
    }
}
