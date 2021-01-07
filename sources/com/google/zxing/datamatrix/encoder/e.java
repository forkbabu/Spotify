package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

public class e {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public e(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private boolean b(int i, int i2) {
        return this.d[(i2 * this.c) + i] >= 0;
    }

    private void c(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        e(i2, i, z);
    }

    private void e(int i, int i2, boolean z) {
        this.d[(i2 * this.c) + i] = z ? (byte) 1 : 0;
    }

    private void f(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        c(i4, i5, i3, 1);
        int i6 = i2 - 1;
        c(i4, i6, i3, 2);
        int i7 = i - 1;
        c(i7, i5, i3, 3);
        c(i7, i6, i3, 4);
        c(i7, i2, i3, 5);
        c(i, i5, i3, 6);
        c(i, i6, i3, 7);
        c(i, i2, i3, 8);
    }

    public final boolean a(int i, int i2) {
        return this.d[(i2 * this.c) + i] == 1;
    }

    public final void d() {
        int i;
        int i2;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.b;
            if (i3 == i6 && i4 == 0) {
                c(i6 - 1, 0, i5, 1);
                c(this.b - 1, 1, i5, 2);
                c(this.b - 1, 2, i5, 3);
                c(0, this.c - 2, i5, 4);
                c(0, this.c - 1, i5, 5);
                c(1, this.c - 1, i5, 6);
                c(2, this.c - 1, i5, 7);
                c(3, this.c - 1, i5, 8);
                i5++;
            }
            int i7 = this.b;
            if (i3 == i7 - 2 && i4 == 0 && this.c % 4 != 0) {
                c(i7 - 3, 0, i5, 1);
                c(this.b - 2, 0, i5, 2);
                c(this.b - 1, 0, i5, 3);
                c(0, this.c - 4, i5, 4);
                c(0, this.c - 3, i5, 5);
                c(0, this.c - 2, i5, 6);
                c(0, this.c - 1, i5, 7);
                c(1, this.c - 1, i5, 8);
                i5++;
            }
            int i8 = this.b;
            if (i3 == i8 - 2 && i4 == 0 && this.c % 8 == 4) {
                c(i8 - 3, 0, i5, 1);
                c(this.b - 2, 0, i5, 2);
                c(this.b - 1, 0, i5, 3);
                c(0, this.c - 2, i5, 4);
                c(0, this.c - 1, i5, 5);
                c(1, this.c - 1, i5, 6);
                c(2, this.c - 1, i5, 7);
                c(3, this.c - 1, i5, 8);
                i5++;
            }
            int i9 = this.b;
            if (i3 == i9 + 4 && i4 == 2 && this.c % 8 == 0) {
                c(i9 - 1, 0, i5, 1);
                c(this.b - 1, this.c - 1, i5, 2);
                c(0, this.c - 3, i5, 3);
                c(0, this.c - 2, i5, 4);
                c(0, this.c - 1, i5, 5);
                c(1, this.c - 3, i5, 6);
                c(1, this.c - 2, i5, 7);
                c(1, this.c - 1, i5, 8);
                i5++;
            }
            do {
                if (i3 < this.b && i4 >= 0 && !b(i4, i3)) {
                    f(i3, i4, i5);
                    i5++;
                }
                i3 -= 2;
                i4 += 2;
                if (i3 < 0) {
                    break;
                }
            } while (i4 < this.c);
            int i10 = i3 + 1;
            int i11 = i4 + 3;
            do {
                if (i10 >= 0 && i11 < this.c && !b(i11, i10)) {
                    f(i10, i11, i5);
                    i5++;
                }
                i10 += 2;
                i11 -= 2;
                i = this.b;
                if (i10 >= i) {
                    break;
                }
            } while (i11 >= 0);
            i3 = i10 + 3;
            i4 = i11 + 1;
            if (i3 >= i && i4 >= (i2 = this.c)) {
                break;
            }
        }
        if (!b(i2 - 1, i - 1)) {
            e(this.c - 1, this.b - 1, true);
            e(this.c - 2, this.b - 2, true);
        }
    }
}
