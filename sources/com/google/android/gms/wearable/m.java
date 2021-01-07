package com.google.android.gms.wearable;

import com.google.android.gms.wearable.g;
import java.util.List;

final class m implements Runnable {
    private final /* synthetic */ List a;
    private final /* synthetic */ g.d b;

    m(g.d dVar, List list) {
        this.b = dVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.this.h();
    }
}
