package com.google.android.exoplayer2.util;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public final class u {
    public byte[] a;
    private int b;
    private int c;
    private int d;

    public u() {
        this.a = f0.f;
    }

    private void a() {
        int i;
        int i2 = this.b;
        g.m(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }

    public int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public void c() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            a();
        }
    }

    public int d() {
        g.m(this.c == 0);
        return this.b;
    }

    public int e() {
        return (this.b * 8) + this.c;
    }

    public void f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.c, i2);
        int i3 = this.c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.a;
        int i5 = this.b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        o(i2);
        a();
    }

    public boolean g() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        n();
        return z;
    }

    public int h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public void i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.c;
            bArr[i] = (byte) (b2 << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (BitmapRenderer.ALPHA_VISIBLE >> i7));
            int i8 = this.c;
            if (i8 + i7 > 8) {
                byte b3 = bArr[i3];
                byte[] bArr3 = this.a;
                int i9 = this.b;
                this.b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.c = i8 - 8;
            }
            int i10 = this.c + i7;
            this.c = i10;
            byte[] bArr4 = this.a;
            int i11 = this.b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.c = 0;
                this.b = i11 + 1;
            }
            a();
        }
    }

    public void j(byte[] bArr, int i, int i2) {
        g.m(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
        a();
    }

    public void k(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = length;
    }

    public void l(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public void m(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void n() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public void o(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public void p(int i) {
        g.m(this.c == 0);
        this.b += i;
        a();
    }

    public u(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.d = length;
    }

    public u(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }
}
