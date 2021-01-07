package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class s {
    public static <R extends i, T> e<R> a(g<T> gVar, w<R, T> wVar, w<R, Status> wVar2) {
        x xVar = new x(wVar2);
        gVar.h(new v(xVar, wVar));
        gVar.e(new u(xVar, wVar2));
        return xVar;
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(je.f0(26, "negative size: ", i2));
    }

    static String c(z6 z6Var, String str) {
        StringBuilder Z0 = je.Z0("# ", str);
        d(z6Var, Z0, 0);
        return Z0.toString();
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
    private static void d(com.google.android.gms.internal.cast.z6 r13, java.lang.StringBuilder r14, int r15) {
        /*
        // Method dump skipped, instructions count: 665
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.s.d(com.google.android.gms.internal.cast.z6, java.lang.StringBuilder, int):void");
    }

    static final void e(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                e(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                e(sb, i, str, entry);
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
                zzlb zzlb = zzlb.a;
                sb.append(k(new zzll(((String) obj).getBytes(v5.a))));
                sb.append('\"');
            } else if (obj instanceof zzlb) {
                sb.append(": \"");
                sb.append(k((zzlb) obj));
                sb.append('\"');
            } else if (obj instanceof r5) {
                sb.append(" {");
                d((r5) obj, sb, i + 2);
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
                e(sb, i4, "key", entry2.getKey());
                e(sb, i4, "value", entry2.getValue());
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

    private static final String f(String str) {
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

    static int g(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String h(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(je.N0(hexString, name.length() + 1));
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder U0 = je.U0(name2.length() + je.N0(sb2, 9), "<", sb2, " threw ", name2);
                    U0.append(">");
                    str2 = U0.toString();
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, indexOf);
            sb3.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static int i(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = h("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(je.f0(26, "negative size: ", i2));
        } else {
            str = h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    static int j(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    static String k(zzlb zzlb) {
        z7 z7Var = new z7(zzlb);
        StringBuilder sb = new StringBuilder(z7Var.a());
        for (int i = 0; i < z7Var.a(); i++) {
            byte b = z7Var.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void l(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = b(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = b(i2, i3, "end index");
            } else {
                str = h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static int m(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(b(i, i2, "index"));
    }
}
