package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;

final class z implements Runnable {
    private final /* synthetic */ g.a a;

    z(g.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.M();
    }
}
