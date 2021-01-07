package com.google.zxing.common;

import java.util.Arrays;

public final class a implements Cloneable {
    private int[] a;
    private int b;

    public a() {
        this.b = 0;
        this.a = new int[1];
    }

    private void e(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public void b(boolean z) {
        e(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public void c(a aVar) {
        int i = aVar.b;
        e(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            b(aVar.f(i2));
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return new a((int[]) this.a.clone(), this.b);
    }

    public void d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            b(z);
            i2--;
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b != aVar.b || !Arrays.equals(this.a, aVar.a)) {
            return false;
        }
        return true;
    }

    public boolean f(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public int g() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public int j() {
        return (this.b + 7) / 8;
    }

    public void k(a aVar) {
        if (this.b == aVar.b) {
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    @Override // java.lang.Object
    public String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    a(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }
}
