package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

public final class a {
    private final b[] a;
    private int b;
    private final int c;
    private final int d;

    a(int i, int i2) {
        b[] bVarArr = new b[i];
        this.a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        return this.a[this.b];
    }

    public byte[][] b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.d * i;
        iArr[0] = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.b++;
    }
}
