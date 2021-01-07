package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class o2 {
    private static boolean A(byte b) {
        return b > -65;
    }

    static int a(int i, byte[] bArr, int i2, int i3, g3 g3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return u(bArr, i2, g3Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return i(bArr, i2, g3Var) + g3Var.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = i(bArr, i2, g3Var);
                    i6 = g3Var.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, g3Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzig.d();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzig.c();
            }
        } else {
            throw zzig.c();
        }
    }

    static int b(int i, byte[] bArr, int i2, int i3, m4<?> m4Var, g3 g3Var) {
        i4 i4Var = (i4) m4Var;
        int i4 = i(bArr, i2, g3Var);
        i4Var.h(g3Var.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, g3Var);
            if (i != g3Var.a) {
                break;
            }
            i4 = i(bArr, i5, g3Var);
            i4Var.h(g3Var.a);
        }
        return i4;
    }

    static int c(int i, byte[] bArr, int i2, int i3, n6 n6Var, g3 g3Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int u = u(bArr, i2, g3Var);
                n6Var.c(i, Long.valueOf(g3Var.b));
                return u;
            } else if (i4 == 1) {
                n6Var.c(i, Long.valueOf(v(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = i(bArr, i2, g3Var);
                int i6 = g3Var.a;
                if (i6 < 0) {
                    throw zzig.b();
                } else if (i6 <= bArr.length - i5) {
                    if (i6 == 0) {
                        n6Var.c(i, zzgm.a);
                    } else {
                        n6Var.c(i, zzgm.h(bArr, i5, i6));
                    }
                    return i5 + i6;
                } else {
                    throw zzig.a();
                }
            } else if (i4 == 3) {
                n6 g = n6.g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = i(bArr, i2, g3Var);
                    int i10 = g3Var.a;
                    if (i10 == i7) {
                        i8 = i10;
                        i2 = i9;
                        break;
                    }
                    i8 = i10;
                    i2 = c(i10, bArr, i9, i3, g, g3Var);
                }
                if (i2 > i3 || i8 != i7) {
                    throw zzig.d();
                }
                n6Var.c(i, g);
                return i2;
            } else if (i4 == 5) {
                n6Var.c(i, Integer.valueOf(h(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzig.c();
            }
        } else {
            throw zzig.c();
        }
    }

    static int d(int i, byte[] bArr, int i2, g3 g3Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            g3Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            g3Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            g3Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            g3Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                g3Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int e(y5<?> y5Var, int i, byte[] bArr, int i2, int i3, m4<?> m4Var, g3 g3Var) {
        int g = g(y5Var, bArr, i2, i3, g3Var);
        m4Var.add(g3Var.c);
        while (g < i3) {
            int i4 = i(bArr, g, g3Var);
            if (i != g3Var.a) {
                break;
            }
            g = g(y5Var, bArr, i4, i3, g3Var);
            m4Var.add(g3Var.c);
        }
        return g;
    }

    static int f(y5 y5Var, byte[] bArr, int i, int i2, int i3, g3 g3Var) {
        n5 n5Var = (n5) y5Var;
        Object a = n5Var.a();
        int m = n5Var.m(a, bArr, i, i2, i3, g3Var);
        n5Var.f(a);
        g3Var.c = a;
        return m;
    }

    static int g(y5 y5Var, byte[] bArr, int i, int i2, g3 g3Var) {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = d(b, bArr, i3, g3Var);
            b2 = g3Var.a;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw zzig.a();
        }
        Object a = y5Var.a();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        y5Var.h(a, bArr, i3, i4, g3Var);
        y5Var.f(a);
        g3Var.c = a;
        return i4;
    }

    static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i, g3 g3Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, g3Var);
        }
        g3Var.a = b;
        return i2;
    }

    static int j(byte[] bArr, int i, m4<?> m4Var, g3 g3Var) {
        i4 i4Var = (i4) m4Var;
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, g3Var);
            i4Var.h(g3Var.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw zzig.a();
    }

    public static <T> p2<T> k(p2<T> p2Var) {
        if ((p2Var instanceof q2) || (p2Var instanceof zzed)) {
            return p2Var;
        }
        if (p2Var instanceof Serializable) {
            return new zzed(p2Var);
        }
        return new q2(p2Var);
    }

    static String l(zzgm zzgm) {
        k6 k6Var = new k6(zzgm);
        StringBuilder sb = new StringBuilder(k6Var.b());
        for (int i = 0; i < k6Var.b(); i++) {
            byte a = k6Var.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String m(l5 l5Var, String str) {
        StringBuilder Z0 = je.Z0("# ", str);
        r(l5Var, Z0, 0);
        return Z0.toString();
    }

    private static final String n(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    static void o(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!A(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !A(b3) && !A(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzig.e();
    }

    static void p(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (A(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || A(b3)))) {
            throw zzig.e();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    static void q(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || A(b2)) {
            throw zzig.e();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f3, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0204, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0216, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x024a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void r(com.google.android.gms.internal.measurement.l5 r13, java.lang.StringBuilder r14, int r15) {
        /*
        // Method dump skipped, instructions count: 665
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o2.r(com.google.android.gms.internal.measurement.l5, java.lang.StringBuilder, int):void");
    }

    static final void s(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                s(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                s(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                zzgm zzgm = zzgm.a;
                sb.append(l(new zzgw(((String) obj).getBytes(h4.a))));
                sb.append('\"');
            } else if (obj instanceof zzgm) {
                sb.append(": \"");
                sb.append(l((zzgm) obj));
                sb.append('\"');
            } else if (obj instanceof f4) {
                sb.append(" {");
                r((f4) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                s(sb, i4, "key", entry2.getKey());
                s(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    static boolean t(byte b) {
        return b >= 0;
    }

    static int u(byte[] bArr, int i, g3 g3Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            g3Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            b = b2;
            i3 = i5;
        }
        g3Var.b = j2;
        return i3;
    }

    static long v(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static void w(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    static int x(byte[] bArr, int i, g3 g3Var) {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw zzig.b();
        } else if (i3 == 0) {
            g3Var.c = "";
            return i2;
        } else {
            g3Var.c = new String(bArr, i2, i3, h4.a);
            return i2 + i3;
        }
    }

    static int y(byte[] bArr, int i, g3 g3Var) {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw zzig.b();
        } else if (i3 == 0) {
            g3Var.c = "";
            return i2;
        } else {
            g3Var.c = t6.g(bArr, i2, i3);
            return i2 + i3;
        }
    }

    static int z(byte[] bArr, int i, g3 g3Var) {
        int i2 = i(bArr, i, g3Var);
        int i3 = g3Var.a;
        if (i3 < 0) {
            throw zzig.b();
        } else if (i3 > bArr.length - i2) {
            throw zzig.a();
        } else if (i3 == 0) {
            g3Var.c = zzgm.a;
            return i2;
        } else {
            g3Var.c = zzgm.h(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
