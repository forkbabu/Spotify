package com.spotify.music.libs.performance.tracking;

import android.util.SparseIntArray;
import com.spotify.remoteconfig.wc;

public class s {
    private final wc a;
    private final SparseIntArray b = new SparseIntArray(6);

    public s(wc wcVar) {
        this.a = wcVar;
    }

    public boolean a() {
        return this.a.c();
    }

    public boolean b(int i) {
        if (!this.a.d() || i < this.a.b()) {
            return false;
        }
        int i2 = this.b.get(i, 0) + 1;
        this.b.put(i, i2);
        if (i2 % this.a.a() == 1) {
            return true;
        }
        return false;
    }
}
