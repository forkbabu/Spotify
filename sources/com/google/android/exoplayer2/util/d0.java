package com.google.android.exoplayer2.util;

import java.util.Arrays;

public final class d0<V> {
    private long[] a = new long[10];
    private V[] b = ((V[]) new Object[10]);
    private int c;
    private int d;

    private void c() {
        int length = this.b.length;
        if (this.d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] vArr = (V[]) new Object[i];
            int i2 = this.c;
            int i3 = length - i2;
            System.arraycopy(this.a, i2, jArr, 0, i3);
            System.arraycopy(this.b, this.c, vArr, 0, i3);
            int i4 = this.c;
            if (i4 > 0) {
                System.arraycopy(this.a, 0, jArr, i3, i4);
                System.arraycopy(this.b, 0, vArr, i3, this.c);
            }
            this.a = jArr;
            this.b = vArr;
            this.c = 0;
        }
    }

    public synchronized void a(long j, V v) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i2 = this.c;
        int i3 = this.d;
        V[] vArr = this.b;
        int length = (i2 + i3) % vArr.length;
        this.a[length] = j;
        vArr[length] = v;
        this.d = i3 + 1;
    }

    public synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public synchronized V d(long j) {
        V v;
        v = null;
        while (true) {
            int i = this.d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.a;
            int i2 = this.c;
            if (j - jArr[i2] < 0) {
                break;
            }
            V[] vArr = this.b;
            V v2 = vArr[i2];
            vArr[i2] = null;
            this.c = (i2 + 1) % vArr.length;
            this.d = i - 1;
            v = v2;
        }
        return v;
    }
}
