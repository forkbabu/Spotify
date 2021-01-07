package com.google.android.exoplayer2.util;

import java.util.Arrays;

public final class q {
    private int a;
    private long[] b = new long[32];

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder W0 = je.W0("Invalid index ", i, ", size is ");
        W0.append(this.a);
        throw new IndexOutOfBoundsException(W0.toString());
    }

    public int c() {
        return this.a;
    }

    public long[] d() {
        return Arrays.copyOf(this.b, this.a);
    }
}
