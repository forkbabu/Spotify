package com.google.android.gms.internal.measurement;

final class p3 extends m3 {
    private int a;
    private int b;
    private int c = Integer.MAX_VALUE;

    p3(byte[] bArr, int i) {
        super(null);
        this.a = i + 0;
    }

    public final int c(int i) {
        if (i >= 0) {
            int i2 = i + 0;
            int i3 = this.c;
            if (i2 <= i3) {
                this.c = i2;
                int i4 = this.a + this.b;
                this.a = i4;
                int i5 = i4 + 0;
                if (i5 > i2) {
                    int i6 = i5 - i2;
                    this.b = i6;
                    this.a = i4 - i6;
                } else {
                    this.b = 0;
                }
                return i3;
            }
            throw zzig.a();
        }
        throw zzig.b();
    }
}
