package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class t6 {
    private static final u6 a;
    public static final /* synthetic */ int b = 0;

    static {
        u6 u6Var;
        if (!(q6.l() && q6.q()) || e3.a()) {
            u6Var = new v6();
        } else {
            u6Var = new x6();
        }
        a = u6Var;
    }

    static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzkz(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int c(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.b(charSequence, bArr, i, i2);
    }

    public static boolean d(byte[] bArr) {
        if (a.a(0, bArr, 0, bArr.length) == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(byte[] bArr, int i, int i2) {
        if (a.a(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static int f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static String g(byte[] bArr, int i, int i2) {
        return a.c(bArr, i, i2);
    }

    static int h(byte[] bArr, int i, int i2) {
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
            return f(b2, bArr[i], bArr[i + 1]);
        } else {
            throw new AssertionError();
        }
    }
}
