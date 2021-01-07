package com.google.android.gms.internal.recaptcha;

/* access modifiers changed from: package-private */
public final class l2 {
    private static final n2 a;
    public static final /* synthetic */ int b = 0;

    static {
        n2 n2Var;
        if (!(k2.j() && k2.n()) || t.a()) {
            n2Var = new m2();
        } else {
            n2Var = new o2();
        }
        a = n2Var;
    }

    public static boolean b(byte[] bArr) {
        if (a.a(0, bArr, 0, bArr.length) == 0) {
            return true;
        }
        return false;
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        if (a.a(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static int e(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        int i4 = -1;
        if (i3 == 0) {
            if (b2 > -12) {
                b2 = -1;
            }
            return b2;
        } else if (i3 == 1) {
            byte b3 = bArr[i];
            if (b2 <= -12 && b3 <= -65) {
                i4 = b2 ^ (b3 << 8);
            }
            return i4;
        } else if (i3 == 2) {
            return d(b2, bArr[i], bArr[i + 1]);
        } else {
            throw new AssertionError();
        }
    }
}
