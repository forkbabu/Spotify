package com.spotify.common.uri;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Base62 {
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    public static final Set<Character> b = Collections.unmodifiableSet(new HashSet<Character>() {
        /* class com.spotify.common.uri.Base62.AnonymousClass1 */

        {
            for (byte b : Base62.a) {
                add(Character.valueOf((char) (b & 255)));
            }
        }
    });

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr2 = a;
        if (bArr.length == 16) {
            int i4 = 0;
            int b2 = b(bArr, 0);
            int b3 = b(bArr, 4);
            int b4 = b(bArr, 8);
            int b5 = b(bArr, 12);
            byte[] bArr3 = new byte[22];
            while (true) {
                i = 6;
                if (i4 >= 6) {
                    break;
                }
                long j = ((long) b2) & 4294967295L;
                long j2 = (((long) b3) & 4294967295L) | ((j % 62) << 32);
                b3 = (int) (j2 / 62);
                long j3 = (((long) b4) & 4294967295L) | ((j2 % 62) << 32);
                long j4 = ((j3 % 62) << 32) | (((long) b5) & 4294967295L);
                b5 = (int) (j4 / 62);
                bArr3[21 - i4] = bArr2[(int) (j4 % 62)];
                i4++;
                b4 = (int) (j3 / 62);
                bArr3 = bArr3;
                b2 = (int) (j / 62);
            }
            while (true) {
                i2 = 11;
                if (i >= 11) {
                    break;
                }
                long j5 = ((long) b3) & 4294967295L;
                b3 = (int) (j5 / 62);
                long j6 = ((j5 % 62) << 32) | (((long) b4) & 4294967295L);
                b4 = (int) (j6 / 62);
                long j7 = ((j6 % 62) << 32) | (((long) b5) & 4294967295L);
                b5 = (int) (j7 / 62);
                bArr3[21 - i] = bArr2[(int) (j7 % 62)];
                i++;
            }
            while (true) {
                if (i2 >= 17) {
                    break;
                }
                long j8 = ((long) b4) & 4294967295L;
                int i5 = (int) (j8 / 62);
                long j9 = ((j8 % 62) << 32) | (((long) b5) & 4294967295L);
                b5 = (int) (j9 / 62);
                bArr3[21 - i2] = bArr2[(int) (j9 % 62)];
                i2++;
                b4 = i5;
            }
            for (i3 = 17; i3 < 22; i3++) {
                bArr3[21 - i3] = bArr2[b5 % 62];
                b5 /= 62;
            }
            return new String(bArr3);
        }
        throw new IllegalArgumentException("Not a 16 byte value");
    }

    private static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
