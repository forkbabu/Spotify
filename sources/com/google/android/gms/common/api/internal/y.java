package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;

/* access modifiers changed from: package-private */
public final class y implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ g.a b;

    y(g.a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d(this.a);
    }
}
