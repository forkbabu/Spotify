package io.reactivex.internal.util;

public final class b<T> {
    int a;
    int b;
    int c;
    T[] d;

    public b(int i, float f) {
        int M = yif.M(i);
        this.a = M - 1;
        this.c = (int) (f * ((float) M));
        this.d = (T[]) new Object[M];
    }

    static int c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.d;
        int i = this.a;
        int c2 = c(t.hashCode()) & i;
        T t3 = tArr[c2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c2 = (c2 + 1) & i;
                t2 = tArr[c2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c2] = t;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 >= this.c) {
            T[] tArr2 = this.d;
            int length = tArr2.length;
            int i3 = length << 1;
            int i4 = i3 - 1;
            T[] tArr3 = (T[]) new Object[i3];
            while (true) {
                int i5 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int c3 = c(tArr2[length].hashCode()) & i4;
                if (tArr3[c3] != null) {
                    do {
                        c3 = (c3 + 1) & i4;
                    } while (tArr3[c3] != null);
                }
                tArr3[c3] = tArr2[length];
                i2 = i5;
            }
            this.a = i4;
            this.c = (int) (((float) i3) * 0.75f);
            this.d = tArr3;
        }
        return true;
    }

    public Object[] b() {
        return this.d;
    }

    public boolean d(T t) {
        T t2;
        T[] tArr = this.d;
        int i = this.a;
        int c2 = c(t.hashCode()) & i;
        T t3 = tArr[c2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            e(c2, tArr, i);
            return true;
        }
        do {
            c2 = (c2 + 1) & i;
            t2 = tArr[c2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        e(c2, tArr, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c2 = c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c2 || c2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c2 && c2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public int f() {
        return this.b;
    }
}
