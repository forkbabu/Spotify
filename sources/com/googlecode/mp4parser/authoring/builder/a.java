package com.googlecode.mp4parser.authoring.builder;

import java.util.Arrays;

public class a {
    public a(double d) {
    }

    public long[] a(x30 x30) {
        int i;
        double g = (double) x30.n1().g();
        Double.isNaN(g);
        Double.isNaN(g);
        long j = (long) (2.0d * g);
        long[] jArr = new long[0];
        long[] T = x30.T();
        long[] B1 = x30.B1();
        if (T != null) {
            int length = T.length;
            long[] jArr2 = new long[length];
            long e = x30.e();
            long j2 = 0;
            long j3 = 0;
            for (int i2 = 0; i2 < B1.length; i2++) {
                int binarySearch = Arrays.binarySearch(T, ((long) i2) + 1);
                if (binarySearch >= 0) {
                    jArr2[binarySearch] = j3;
                }
                j3 += B1[i2];
            }
            int i3 = 0;
            while (true) {
                i = length - 1;
                if (i3 >= i) {
                    break;
                }
                long j4 = jArr2[i3];
                int i4 = i3 + 1;
                long j5 = jArr2[i4];
                if (j2 <= j5 && Math.abs(j4 - j2) < Math.abs(j5 - j2)) {
                    jArr = rw.k(jArr, T[i3]);
                    j2 = jArr2[i3] + j;
                }
                i3 = i4;
            }
            if (e - jArr2[i] > j / 2) {
                return rw.k(jArr, T[i]);
            }
            return jArr;
        }
        long[] jArr3 = {1};
        double d = 0.0d;
        for (int i5 = 1; i5 < B1.length; i5++) {
            double d2 = (double) B1[i5];
            Double.isNaN(d2);
            Double.isNaN(g);
            Double.isNaN(d2);
            Double.isNaN(g);
            double d3 = (d2 / g) + d;
            if (d3 >= 2.0d) {
                if (i5 > 0) {
                    jArr3 = rw.k(jArr3, (long) (i5 + 1));
                }
                d = 0.0d;
            } else {
                d = d3;
            }
        }
        if (d < 2.0d && jArr3.length > 1) {
            jArr3[jArr3.length - 1] = ((((long) (B1.length + 1)) - jArr3[jArr3.length - 2]) / 2) + jArr3[jArr3.length - 2];
        }
        return jArr3;
    }
}
