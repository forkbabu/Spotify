package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;

public final class NumberInput {
    static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final /* synthetic */ int a = 0;

    private static NumberFormatException _badBD(String str) {
        return new NumberFormatException(je.y0("Value \"", str, "\" can not be represented as BigDecimal"));
    }

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                if (charAt < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int parseAsInt(String str, int i) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return i;
        }
        int i2 = 0;
        if (length > 0) {
            char charAt = trim.charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i2 = 1;
            }
        }
        while (i2 < length) {
            char charAt2 = trim.charAt(i2);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i;
        }
    }

    public static BigDecimal parseBigDecimal(String str) {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw _badBD(str);
        }
    }

    public static double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int parseInt(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - '0';
        if (i2 > 4) {
            int i4 = i + 1;
            int i5 = cArr[i4] - '0';
            int i6 = i4 + 1;
            int i7 = cArr[i6] - '0';
            int i8 = i6 + 1;
            int i9 = cArr[i8] - '0';
            i = i8 + 1;
            i3 = (cArr[i] - '0') + ((i9 + ((i7 + ((i5 + (i3 * 10)) * 10)) * 10)) * 10);
            i2 -= 4;
            if (i2 > 4) {
                int i10 = i + 1;
                int i11 = cArr[i10] - '0';
                int i12 = i10 + 1;
                int i13 = cArr[i12] - '0';
                int i14 = i12 + 1;
                return (cArr[i14 + 1] - '0') + (((cArr[i14] - '0') + ((i13 + ((i11 + (i3 * 10)) * 10)) * 10)) * 10);
            }
        }
        if (i2 <= 1) {
            return i3;
        }
        int i15 = i + 1;
        int i16 = (i3 * 10) + (cArr[i15] - '0');
        if (i2 <= 2) {
            return i16;
        }
        int i17 = i15 + 1;
        int i18 = (i16 * 10) + (cArr[i17] - '0');
        return i2 > 3 ? (i18 * 10) + (cArr[i17 + 1] - '0') : i18;
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) parseInt(cArr, i, i3)) * 1000000000) + ((long) parseInt(cArr, i + i3, 9));
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw _badBD(new String(cArr, i, i2));
        }
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return (long) parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                if (charAt < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        return java.lang.Integer.parseInt(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseInt(java.lang.String r8) {
        /*
            r0 = 0
            char r1 = r8.charAt(r0)
            int r2 = r8.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L_0x000f
            r0 = 1
        L_0x000f:
            r4 = 10
            if (r0 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            if (r2 <= r4) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            char r1 = r8.charAt(r3)
            r3 = 2
            goto L_0x002c
        L_0x001e:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0023:
            r5 = 9
            if (r2 <= r5) goto L_0x002c
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x002c:
            r5 = 57
            if (r1 > r5) goto L_0x0082
            r6 = 48
            if (r1 >= r6) goto L_0x0035
            goto L_0x0082
        L_0x0035:
            int r1 = r1 - r6
            if (r3 >= r2) goto L_0x007e
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L_0x0079
            if (r3 >= r6) goto L_0x0043
            goto L_0x0079
        L_0x0043:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L_0x007e
            int r3 = r7 + 1
            char r7 = r8.charAt(r7)
            if (r7 > r5) goto L_0x0074
            if (r7 >= r6) goto L_0x0054
            goto L_0x0074
        L_0x0054:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L_0x007e
        L_0x005a:
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L_0x006f
            if (r3 >= r6) goto L_0x0065
            goto L_0x006f
        L_0x0065:
            int r1 = r1 * 10
            int r3 = r3 + -48
            int r1 = r1 + r3
            if (r7 < r2) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            r3 = r7
            goto L_0x005a
        L_0x006f:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0074:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0079:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x007e:
            if (r0 == 0) goto L_0x0081
            int r1 = -r1
        L_0x0081:
            return r1
        L_0x0082:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }
}
