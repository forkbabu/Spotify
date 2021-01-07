package com.google.zxing.common.reedsolomon;

public final class a {
    public static final a g = new a(4201, 4096, 1);
    public static final a h = new a(1033, 1024, 1);
    public static final a i = new a(67, 64, 1);
    public static final a j = new a(19, 16, 1);
    public static final a k = new a(285, 256, 0);
    public static final a l = new a(301, 256, 1);
    private final int[] a;
    private final int[] b;
    private final b c;
    private final int d;
    private final int e;
    private final int f;

    public a(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    public b a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i2) {
        return this.a[i2];
    }

    public int c() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public b d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int e(int i2) {
        if (i2 != 0) {
            return this.a[(this.d - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int f(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.d - 1)];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return je.A0(sb, this.d, ')');
    }
}
