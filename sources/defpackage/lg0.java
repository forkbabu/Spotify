package defpackage;

/* renamed from: lg0  reason: default package */
public final class lg0 {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void b(StringBuilder sb, byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                int i = b & 255;
                char[] cArr = a;
                sb.append(cArr[i >>> 4]);
                sb.append(cArr[i & 15]);
            }
        }
    }
}
