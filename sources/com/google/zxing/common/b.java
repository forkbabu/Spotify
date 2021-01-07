package com.google.zxing.common;

import java.util.Arrays;

public final class b implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] f;

    public b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.f = new int[(i3 * i2)];
    }

    public void b() {
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            this.f[i] = 0;
        }
    }

    public boolean c(int i, int i2) {
        return ((this.f[(i / 32) + (i2 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new b(this.a, this.b, this.c, (int[]) this.f.clone());
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.f, bVar.f)) {
            return true;
        }
        return false;
    }

    public void f(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.f;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void g(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.f) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder((this.a + 1) * this.b);
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(c(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = iArr;
    }
}
