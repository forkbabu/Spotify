package io.netty.util.internal.logging;

import java.io.PrintStream;
import java.util.Map;

final class f {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static io.netty.util.internal.logging.a a(java.lang.String r11, java.lang.Object[] r12) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.logging.f.a(java.lang.String, java.lang.Object[]):io.netty.util.internal.logging.a");
    }

    private static void b(StringBuffer stringBuffer, Object obj, Map<Object[], Void> map) {
        if (obj == null) {
            stringBuffer.append("null");
        } else if (!obj.getClass().isArray()) {
            try {
                stringBuffer.append(obj.toString());
            } catch (Throwable th) {
                PrintStream printStream = System.err;
                StringBuilder V0 = je.V0("SLF4J: Failed toString() invocation on an object of type [");
                V0.append(obj.getClass().getName());
                V0.append(']');
                printStream.println(V0.toString());
                th.printStackTrace();
                stringBuffer.append("[FAILED toString()]");
            }
        } else {
            int i = 0;
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                stringBuffer.append('[');
                int length = zArr.length;
                while (i < length) {
                    stringBuffer.append(zArr[i]);
                    if (i != length - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                stringBuffer.append('[');
                int length2 = bArr.length;
                while (i < length2) {
                    stringBuffer.append((int) bArr[i]);
                    if (i != length2 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                stringBuffer.append('[');
                int length3 = cArr.length;
                while (i < length3) {
                    stringBuffer.append(cArr[i]);
                    if (i != length3 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                stringBuffer.append('[');
                int length4 = sArr.length;
                while (i < length4) {
                    stringBuffer.append((int) sArr[i]);
                    if (i != length4 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                stringBuffer.append('[');
                int length5 = iArr.length;
                while (i < length5) {
                    stringBuffer.append(iArr[i]);
                    if (i != length5 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                stringBuffer.append('[');
                int length6 = jArr.length;
                while (i < length6) {
                    stringBuffer.append(jArr[i]);
                    if (i != length6 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                stringBuffer.append('[');
                int length7 = fArr.length;
                while (i < length7) {
                    stringBuffer.append(fArr[i]);
                    if (i != length7 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                stringBuffer.append('[');
                int length8 = dArr.length;
                while (i < length8) {
                    stringBuffer.append(dArr[i]);
                    if (i != length8 - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                stringBuffer.append(']');
            } else {
                Object[] objArr = (Object[]) obj;
                stringBuffer.append('[');
                if (!map.containsKey(objArr)) {
                    map.put(objArr, null);
                    int length9 = objArr.length;
                    while (i < length9) {
                        b(stringBuffer, objArr[i], map);
                        if (i != length9 - 1) {
                            stringBuffer.append(", ");
                        }
                        i++;
                    }
                    map.remove(objArr);
                } else {
                    stringBuffer.append("...");
                }
                stringBuffer.append(']');
            }
        }
    }

    static a c(String str, Object obj) {
        return a(str, new Object[]{obj});
    }

    static a d(String str, Object obj, Object obj2) {
        return a(str, new Object[]{obj, obj2});
    }
}
