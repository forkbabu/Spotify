package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.util.List;

/* access modifiers changed from: package-private */
public final class w {
    private static final String a(String str) {
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

    static String b(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte c = byteString.c(i);
            if (c == 34) {
                sb.append("\\\"");
            } else if (c == 39) {
                sb.append("\\'");
            } else if (c != 92) {
                switch (c) {
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
                        if (c < 32 || c > 126) {
                            sb.append('\\');
                            sb.append((char) (((c >>> 6) & 3) + 48));
                            sb.append((char) (((c >>> 3) & 7) + 48));
                            sb.append((char) ((c & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i, str, obj2);
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ByteString byteString = ByteString.a;
            sb.append(b(new ByteString.LiteralByteString(((String) obj).getBytes(o.a))));
            sb.append('\"');
        } else if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(b((ByteString) obj));
            sb.append('\"');
        } else if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            d((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
        if (((java.lang.Integer) r9).intValue() == 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0171, code lost:
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0183, code lost:
        if (((java.lang.Double) r9).doubleValue() == 0.0d) goto L_0x01b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void d(com.google.protobuf.u r13, java.lang.StringBuilder r14, int r15) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.d(com.google.protobuf.u, java.lang.StringBuilder, int):void");
    }

    static String e(u uVar, String str) {
        StringBuilder Z0 = je.Z0("# ", str);
        d(uVar, Z0, 0);
        return Z0.toString();
    }
}
