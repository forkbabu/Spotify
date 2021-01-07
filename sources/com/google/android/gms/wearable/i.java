package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.g;

final class i implements Runnable {
    private final /* synthetic */ DataHolder a;
    private final /* synthetic */ g.d b;

    i(g.d dVar, DataHolder dataHolder) {
        this.b = dVar;
        this.a = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = new d(this.a);
        try {
            g.this.i();
        } finally {
            dVar.d();
        }
    }
}
