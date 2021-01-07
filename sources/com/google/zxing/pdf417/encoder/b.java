package com.google.zxing.pdf417.encoder;

/* access modifiers changed from: package-private */
public final class b {
    private final byte[] a;
    private int b = 0;

    b(int i) {
        this.a = new byte[i];
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            this.a[i3] = z ? (byte) 1 : 0;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] b(int i) {
        int length = this.a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.a[i2 / i];
        }
        return bArr;
    }
}
