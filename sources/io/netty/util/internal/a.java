package io.netty.util.internal;

import java.util.Arrays;

public final class a implements CharSequence, Appendable {
    private char[] a;
    private int b;

    public a(int i) {
        if (i >= 1) {
            this.a = new char[i];
            return;
        }
        throw new IllegalArgumentException(je.q0("length: ", i, " (length: >= 1)"));
    }

    public a a(char c) {
        try {
            char[] cArr = this.a;
            int i = this.b;
            this.b = i + 1;
            cArr[i] = c;
        } catch (IndexOutOfBoundsException unused) {
            char[] cArr2 = this.a;
            int length = cArr2.length << 1;
            if (length >= 0) {
                char[] cArr3 = new char[length];
                this.a = cArr3;
                System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
                this.a[this.b - 1] = c;
            } else {
                throw new IllegalStateException();
            }
        }
        return this;
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) {
        a(c);
        return this;
    }

    public a b(CharSequence charSequence, int i, int i2) {
        if (charSequence.length() >= i2) {
            int i3 = i2 - i;
            char[] cArr = this.a;
            int length = cArr.length;
            int i4 = this.b;
            if (i3 > length - i4) {
                int i5 = i4 + i3;
                int length2 = cArr.length;
                do {
                    length2 <<= 1;
                    if (length2 < 0) {
                        throw new IllegalStateException();
                    }
                } while (i5 > length2);
                char[] cArr2 = new char[length2];
                System.arraycopy(cArr, 0, cArr2, 0, i4);
                this.a = cArr2;
            }
            if (charSequence instanceof a) {
                System.arraycopy(((a) charSequence).a, i, this.a, this.b, i3);
                this.b += i3;
                return this;
            }
            while (i < i2) {
                char[] cArr3 = this.a;
                int i6 = this.b;
                this.b = i6 + 1;
                cArr3[i6] = charSequence.charAt(i);
                i++;
            }
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    public char c(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i <= this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public void d() {
        this.b = 0;
    }

    public String e(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new a(Arrays.copyOfRange(this.a, i, i2));
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public String toString() {
        return new String(this.a, 0, this.b);
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        b(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        b(charSequence, 0, charSequence.length());
        return this;
    }

    private a(char[] cArr) {
        if (cArr.length >= 1) {
            this.a = cArr;
            this.b = cArr.length;
            return;
        }
        throw new IllegalArgumentException(je.B0(je.V0("length: "), cArr.length, " (length: >= 1)"));
    }
}
