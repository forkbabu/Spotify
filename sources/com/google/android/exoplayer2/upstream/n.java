package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.Arrays;

public final class n {
    private final boolean a;
    private final int b;
    private final e[] c;
    private int d;
    private int e;
    private int f;
    private e[] g;

    public n(boolean z, int i) {
        g.a(i > 0);
        g.a(true);
        this.a = z;
        this.b = i;
        this.f = 0;
        this.g = new e[100];
        this.c = new e[1];
    }

    public synchronized e a() {
        e eVar;
        this.e++;
        int i = this.f;
        if (i > 0) {
            e[] eVarArr = this.g;
            int i2 = i - 1;
            this.f = i2;
            eVar = eVarArr[i2];
            eVarArr[i2] = null;
        } else {
            eVar = new e(new byte[this.b], 0);
        }
        return eVar;
    }

    public int b() {
        return this.b;
    }

    public synchronized int c() {
        return this.e * this.b;
    }

    public synchronized void d(e eVar) {
        e[] eVarArr = this.c;
        eVarArr[0] = eVar;
        e(eVarArr);
    }

    public synchronized void e(e[] eVarArr) {
        int i = this.f;
        int length = eVarArr.length + i;
        e[] eVarArr2 = this.g;
        if (length >= eVarArr2.length) {
            this.g = (e[]) Arrays.copyOf(eVarArr2, Math.max(eVarArr2.length * 2, i + eVarArr.length));
        }
        for (e eVar : eVarArr) {
            e[] eVarArr3 = this.g;
            int i2 = this.f;
            this.f = i2 + 1;
            eVarArr3[i2] = eVar;
        }
        this.e -= eVarArr.length;
        notifyAll();
    }

    public synchronized void f() {
        if (this.a) {
            g(0);
        }
    }

    public synchronized void g(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            h();
        }
    }

    public synchronized void h() {
        int max = Math.max(0, f0.e(this.d, this.b) - this.e);
        int i = this.f;
        if (max < i) {
            Arrays.fill(this.g, max, i, (Object) null);
            this.f = max;
        }
    }
}
