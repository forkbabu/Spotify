package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.e0;

public final class p {
    private final SparseArray<e0> a = new SparseArray<>();

    public e0 a(int i) {
        e0 e0Var = this.a.get(i);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(Long.MAX_VALUE);
        this.a.put(i, e0Var2);
        return e0Var2;
    }

    public void b() {
        this.a.clear();
    }
}
