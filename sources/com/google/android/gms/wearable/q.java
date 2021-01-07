package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;

final class q implements Runnable {
    private final /* synthetic */ xv a;
    private final /* synthetic */ g.d b;

    q(g.d dVar, xv xvVar) {
        this.b = dVar;
        this.a = xvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.I1(g.this);
        this.a.I1(g.s(g.this));
    }
}
