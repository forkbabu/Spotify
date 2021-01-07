package io.netty.util.internal;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.features.ads.model.Ad;
import java.util.ArrayList;
import java.util.List;

public final class r {
    public static final String a = System.getProperty("line.separator");
    private static final String[] b = new String[256];
    private static final String[] c = new String[256];

    static {
        int i = 0;
        while (i < 10) {
            b[i] = je.p0(Ad.DEFAULT_SKIPPABLE_AD_DELAY, i);
            c[i] = String.valueOf(i);
            i++;
        }
        while (i < 16) {
            char c2 = (char) ((i + 97) - 10);
            b[i] = je.o0(Ad.DEFAULT_SKIPPABLE_AD_DELAY, c2);
            c[i] = String.valueOf(c2);
            i++;
        }
        while (true) {
            String[] strArr = b;
            if (i < strArr.length) {
                String hexString = Integer.toHexString(i);
                strArr[i] = hexString;
                c[i] = hexString;
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(int i) {
        return b[i & BitmapRenderer.ALPHA_VISIBLE];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r9 != ',') goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence b(java.lang.CharSequence r13) {
        /*
            if (r13 == 0) goto L_0x0084
            int r0 = r13.length()
            if (r0 != 0) goto L_0x0009
            return r13
        L_0x0009:
            int r1 = r0 + -1
            r2 = 0
            char r3 = r13.charAt(r2)
            boolean r3 = c(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0025
            char r3 = r13.charAt(r1)
            boolean r3 = c(r3)
            if (r3 == 0) goto L_0x0025
            if (r0 == r4) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r0 + 7
            r5.<init>(r6)
            r6 = 34
            r5.append(r6)
            r7 = 0
            r8 = 0
        L_0x0034:
            if (r2 >= r0) goto L_0x0079
            char r9 = r13.charAt(r2)
            r10 = 10
            if (r9 == r10) goto L_0x0072
            r10 = 13
            if (r9 == r10) goto L_0x0072
            if (r9 == r6) goto L_0x0049
            r10 = 44
            if (r9 == r10) goto L_0x0072
            goto L_0x0073
        L_0x0049:
            if (r2 == 0) goto L_0x006d
            if (r2 != r1) goto L_0x004e
            goto L_0x006d
        L_0x004e:
            int r10 = r2 + 1
            char r11 = r13.charAt(r10)
            boolean r11 = c(r11)
            int r12 = r2 + -1
            char r12 = r13.charAt(r12)
            boolean r12 = c(r12)
            if (r12 != 0) goto L_0x0073
            if (r11 == 0) goto L_0x0068
            if (r10 != r1) goto L_0x0073
        L_0x0068:
            r5.append(r6)
            r7 = 1
            goto L_0x0073
        L_0x006d:
            if (r3 != 0) goto L_0x0076
            r5.append(r6)
        L_0x0072:
            r8 = 1
        L_0x0073:
            r5.append(r9)
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0079:
            if (r7 != 0) goto L_0x007f
            if (r8 == 0) goto L_0x0083
            if (r3 != 0) goto L_0x0083
        L_0x007f:
            r5.append(r6)
            r13 = r5
        L_0x0083:
            return r13
        L_0x0084:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "value"
            r13.<init>(r0)
            goto L_0x008d
        L_0x008c:
            throw r13
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.r.b(java.lang.CharSequence):java.lang.CharSequence");
    }

    private static boolean c(char c2) {
        return c2 == '\"';
    }

    private static IllegalArgumentException d(CharSequence charSequence, int i) {
        return new IllegalArgumentException("invalid escaped CSV field: " + ((Object) charSequence) + " index: " + i);
    }

    public static String e(Class<?> cls) {
        if (cls != null) {
            String name = cls.getName();
            int lastIndexOf = name.lastIndexOf(46);
            return lastIndexOf > -1 ? name.substring(lastIndexOf + 1) : name;
        }
        throw new NullPointerException("clazz");
    }

    public static String f(Object obj) {
        return obj == null ? "null_object" : e(obj.getClass());
    }

    public static List<CharSequence> g(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(2);
        e e = e.e();
        StringBuilder sb = e.h;
        if (sb == null) {
            sb = new StringBuilder(512);
            e.h = sb;
        } else {
            sb.setLength(0);
        }
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(i);
            if (!z) {
                if (!(charAt == '\n' || charAt == '\r')) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            sb.append(charAt);
                        } else {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        }
                    } else if (sb.length() == 0) {
                        z = true;
                    }
                }
                throw d(charSequence, i);
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else if (i == length) {
                arrayList.add(sb.toString());
                return arrayList;
            } else {
                i++;
                char charAt2 = charSequence.charAt(i);
                if (charAt2 == '\"') {
                    sb.append('\"');
                } else if (charAt2 == ',') {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    z = false;
                } else {
                    throw d(charSequence, i - 1);
                }
            }
            i++;
        }
        if (!z) {
            arrayList.add(sb.toString());
            return arrayList;
        }
        throw d(charSequence, length);
    }
}
