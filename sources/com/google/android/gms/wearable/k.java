package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;

final class k implements Runnable {
    private final /* synthetic */ iw a;
    private final /* synthetic */ g.d b;

    k(g.d dVar, iw iwVar) {
        this.b = dVar;
        this.a = iwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.o();
    }
}
