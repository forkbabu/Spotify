package defpackage;

/* renamed from: me  reason: default package */
public class me {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static String b(byte[] bArr, int i) {
        int length = bArr.length;
        char[] cArr = new char[((length << 1) + (i > 0 ? length / i : 0))];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i > 0 && i3 % i == 0 && i2 > 0) {
                cArr[i2] = '-';
                i2++;
            }
            int i4 = i2 + 1;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(bArr[i3] & 240) >>> 4];
            i2 = i4 + 1;
            cArr[i4] = cArr2[bArr[i3] & 15];
        }
        return new String(cArr);
    }
}
