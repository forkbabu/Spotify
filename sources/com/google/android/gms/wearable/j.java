package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;

final class j implements Runnable {
    private final /* synthetic */ gw a;
    private final /* synthetic */ g.d b;

    j(g.d dVar, gw gwVar) {
        this.b = dVar;
        this.a = gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.l(this.a);
    }
}
