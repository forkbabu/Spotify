package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;

final class o implements Runnable {
    private final /* synthetic */ nw a;
    private final /* synthetic */ g.d b;

    o(g.d dVar, nw nwVar) {
        this.b = dVar;
        this.a = nwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.m();
    }
}
