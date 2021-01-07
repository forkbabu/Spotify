package com.spotify.cosmos.android;

import io.reactivex.functions.g;
import io.reactivex.t;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ l(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t tVar = this.a;
        Throwable th = (Throwable) obj;
        if (!tVar.d()) {
            tVar.onError(th);
        }
    }
}
