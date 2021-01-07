package com.comscore.util;

public class Base64Coder {
    private static char[] a = new char[64];
    private static byte[] b = new byte[128];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = a;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        int i2 = 0;
        while (true) {
            byte[] bArr = b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            b[a[i3]] = (byte) i3;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static byte[] decode(char[] cArr) {
        int i;
        char c;
        char c2;
        int i2;
        int length = cArr.length;
        if (length % 4 == 0) {
            while (length > 0 && cArr[length - 1] == '=') {
                length--;
            }
            int i3 = (length * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5 = i2) {
                int i6 = i5 + 1;
                char c3 = cArr[i5];
                int i7 = i6 + 1;
                char c4 = cArr[i6];
                if (i7 < length) {
                    i = i7 + 1;
                    c = cArr[i7];
                } else {
                    i = i7;
                    c = 'A';
                }
                if (i < length) {
                    i2 = i + 1;
                    c2 = cArr[i];
                } else {
                    i2 = i;
                    c2 = 'A';
                }
                if (c3 > 127 || c4 > 127 || c > 127 || c2 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte[] bArr2 = b;
                byte b2 = bArr2[c3];
                byte b3 = bArr2[c4];
                byte b4 = bArr2[c];
                byte b5 = bArr2[c2];
                if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i8 = (b2 << 2) | (b3 >>> 4);
                int i9 = ((b3 & 15) << 4) | (b4 >>> 2);
                int i10 = ((b4 & 3) << 6) | b5;
                int i11 = i4 + 1;
                bArr[i4] = (byte) i8;
                if (i11 < i3) {
                    bArr[i11] = (byte) i9;
                    i11++;
                }
                if (i11 < i3) {
                    bArr[i11] = (byte) i10;
                    i4 = i11 + 1;
                } else {
                    i4 = i11;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static char[] encode(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = ((i * 4) + 2) / 3;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int i9 = bArr[i6] & 255;
            if (i8 < i) {
                i2 = i8 + 1;
                i3 = bArr[i8] & 255;
            } else {
                i2 = i8;
                i3 = 0;
            }
            if (i2 < i) {
                i4 = bArr[i2] & 255;
                i2++;
            } else {
                i4 = 0;
            }
            int i10 = i9 >>> 2;
            int i11 = ((i9 & 3) << 4) | (i3 >>> 4);
            int i12 = ((i3 & 15) << 2) | (i4 >>> 6);
            int i13 = i4 & 63;
            int i14 = i7 + 1;
            char[] cArr2 = a;
            cArr[i7] = cArr2[i10];
            int i15 = i14 + 1;
            cArr[i14] = cArr2[i11];
            char c = '=';
            cArr[i15] = i15 < i5 ? cArr2[i12] : '=';
            int i16 = i15 + 1;
            if (i16 < i5) {
                c = cArr2[i13];
            }
            cArr[i16] = c;
            i7 = i16 + 1;
            i6 = i2;
        }
        return cArr;
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }
}
