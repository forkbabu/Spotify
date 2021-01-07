package com.spotify.mobile.android.glue;

import android.util.SparseIntArray;
import com.spotify.mobile.android.ui.layout_traits.a;

/* access modifiers changed from: package-private */
public final class a {
    private final SparseIntArray a = new SparseIntArray();
    private final SparseIntArray b = new SparseIntArray();
    private final SparseIntArray c = new SparseIntArray();
    private final int d;
    private final int e;
    private final boolean f;

    public a(int i, int i2, boolean z) {
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    private int b(int i, a.b bVar) {
        if (i == bVar.b() - 1) {
            return Math.max(this.e, this.d);
        }
        int i2 = this.c.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int b2 = bVar.b();
        int max = ((((b2 + 1) * this.d) + Math.max((this.e - this.d) * 2, 0)) / b2) - f(i, bVar);
        this.c.put(i, max);
        return max;
    }

    private int e(int i, a.b bVar) {
        int i2 = this.a.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int c2 = bVar.c(i);
        this.a.put(i, c2);
        return c2;
    }

    private int f(int i, a.b bVar) {
        if (i == 0) {
            return Math.max(this.e, this.d);
        }
        int i2 = this.b.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        int b2 = this.d - b(i - 1, bVar);
        this.b.put(i, b2);
        return b2;
    }

    public void a() {
        this.a.clear();
    }

    public int c(int i, a.b bVar) {
        if (!this.f) {
            return f(e(i, bVar), bVar);
        }
        return b((bVar.d(i) + e(i, bVar)) - 1, bVar);
    }

    public int d(int i, a.b bVar) {
        if (this.f) {
            return f(e(i, bVar), bVar);
        }
        return b((bVar.d(i) + e(i, bVar)) - 1, bVar);
    }
}
