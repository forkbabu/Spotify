package com.google.android.gms.internal.recaptcha;

import java.util.Arrays;

public final class d2 {
    private static final d2 d = new d2(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;

    private d2() {
        this(0, new int[8], new Object[8], true);
    }

    public static d2 a() {
        return d;
    }

    static d2 b(d2 d2Var, d2 d2Var2) {
        int i = d2Var.a + d2Var2.a;
        int[] copyOf = Arrays.copyOf(d2Var.b, i);
        System.arraycopy(d2Var2.b, 0, copyOf, d2Var.a, d2Var2.a);
        Object[] copyOf2 = Arrays.copyOf(d2Var.c, i);
        System.arraycopy(d2Var2.c, 0, copyOf2, d2Var.a, d2Var2.a);
        return new d2(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: package-private */
    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            k.d(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        int i = this.a;
        if (i == d2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = d2Var.b;
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
                Object[] objArr2 = d2Var.c;
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

    private d2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
    }
}
