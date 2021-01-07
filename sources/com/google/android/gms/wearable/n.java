package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;

final class n implements Runnable {
    private final /* synthetic */ tv a;
    private final /* synthetic */ g.d b;

    n(g.d dVar, tv tvVar) {
        this.b = dVar;
        this.a = tvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.e();
    }
}
