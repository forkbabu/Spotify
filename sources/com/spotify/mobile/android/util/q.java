package com.spotify.mobile.android.util;

import com.google.common.base.Charsets;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public final class q {
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

    public static byte[] a(String str) {
        int i;
        if (str.length() == 22) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 22; i2 < i7; i7 = 22) {
                char charAt = str.charAt(i2);
                if (charAt >= '0' && charAt <= '9') {
                    i = charAt - '0';
                } else if (charAt >= 'a' && charAt <= 'z') {
                    i = charAt - 'W';
                } else if (charAt < 'A' || charAt > 'Z') {
                    throw new IllegalArgumentException(je.o0("Non base-62 character ", charAt));
                } else {
                    i = charAt - 29;
                }
                long j = ((((long) i3) & 4294967295L) * 62) + ((long) i);
                i3 = (int) j;
                long j2 = ((((long) i4) & 4294967295L) * 62) + (j >>> 32);
                i4 = (int) j2;
                long j3 = ((((long) i5) & 4294967295L) * 62) + (j2 >>> 32);
                i5 = (int) j3;
                i6 = (int) (((4294967295L & ((long) i6)) * 62) + (j3 >>> 32));
                i2++;
            }
            byte[] bArr = new byte[16];
            b(i3, bArr, 12);
            b(i4, bArr, 8);
            b(i5, bArr, 4);
            b(i6, bArr, 0);
            return bArr;
        }
        throw new IllegalArgumentException(je.y0("base62 id ", str, " does not have length 22"));
    }

    private static void b(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
        int i3 = i >>> 8;
        bArr[i2 + 2] = (byte) (i3 & BitmapRenderer.ALPHA_VISIBLE);
        int i4 = i3 >>> 8;
        bArr[i2 + 1] = (byte) (i4 & BitmapRenderer.ALPHA_VISIBLE);
        bArr[i2] = (byte) ((i4 >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
    }

    public static String c(byte[] bArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr2 = a;
        if (bArr.length == 16) {
            int i4 = 0;
            int d = d(bArr, 0);
            int d2 = d(bArr, 4);
            int d3 = d(bArr, 8);
            int d4 = d(bArr, 12);
            byte[] bArr3 = new byte[22];
            while (true) {
                i = 6;
                if (i4 >= 6) {
                    break;
                }
                long j = ((long) d) & 4294967295L;
                long j2 = (((long) d2) & 4294967295L) | ((j % 62) << 32);
                d2 = (int) (j2 / 62);
                long j3 = (((long) d3) & 4294967295L) | ((j2 % 62) << 32);
                long j4 = ((j3 % 62) << 32) | (((long) d4) & 4294967295L);
                d4 = (int) (j4 / 62);
                bArr3[21 - i4] = bArr2[(int) (j4 % 62)];
                i4++;
                d3 = (int) (j3 / 62);
                bArr3 = bArr3;
                d = (int) (j / 62);
            }
            while (true) {
                i2 = 11;
                if (i >= 11) {
                    break;
                }
                long j5 = ((long) d2) & 4294967295L;
                d2 = (int) (j5 / 62);
                long j6 = ((j5 % 62) << 32) | (((long) d3) & 4294967295L);
                d3 = (int) (j6 / 62);
                long j7 = ((j6 % 62) << 32) | (((long) d4) & 4294967295L);
                d4 = (int) (j7 / 62);
                bArr3[21 - i] = bArr2[(int) (j7 % 62)];
                i++;
            }
            while (true) {
                if (i2 >= 17) {
                    break;
                }
                long j8 = ((long) d3) & 4294967295L;
                int i5 = (int) (j8 / 62);
                long j9 = ((j8 % 62) << 32) | (((long) d4) & 4294967295L);
                d4 = (int) (j9 / 62);
                bArr3[21 - i2] = bArr2[(int) (j9 % 62)];
                i2++;
                d3 = i5;
            }
            for (i3 = 17; i3 < 22; i3++) {
                bArr3[21 - i3] = bArr2[d4 % 62];
                d4 /= 62;
            }
            return new String(bArr3, Charsets.UTF_8);
        }
        throw new IllegalArgumentException("Not a 16 byte value");
    }

    private static int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
