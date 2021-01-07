package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;

public final class b0 {
    private final SparseIntArray a = new SparseIntArray();
    private e b;

    public b0(e eVar) {
        if (eVar != null) {
            this.b = eVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final int a(int i) {
        return this.a.get(i, -1);
    }

    public final int b(Context context, a.f fVar) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (fVar != null) {
            int i = 0;
            if (!fVar.e()) {
                return 0;
            }
            int l = fVar.l();
            int i2 = this.a.get(l, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.a.size()) {
                    i = i2;
                    break;
                }
                int keyAt = this.a.keyAt(i3);
                if (keyAt > l && this.a.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                i = this.b.c(context, l);
            }
            this.a.put(l, i);
            return i;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void c() {
        this.a.clear();
    }
}
