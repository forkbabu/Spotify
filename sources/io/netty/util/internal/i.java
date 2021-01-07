package io.netty.util.internal;

public final class i {
    public static boolean a(int i, int i2, int i3) {
        int i4 = i | i2;
        int i5 = i + i2;
        return ((i4 | i5) | (i3 - i5)) < 0;
    }

    public static int b(int i) {
        if (i <= 0) {
            return 1;
        }
        if (i >= 1073741824) {
            return 1073741824;
        }
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
