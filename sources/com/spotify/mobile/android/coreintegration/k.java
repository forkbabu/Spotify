package com.spotify.mobile.android.coreintegration;

import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ k(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t.b(this.a, (CoreAutoShutdownHelper$AutoShutdownAction) obj);
    }
}
