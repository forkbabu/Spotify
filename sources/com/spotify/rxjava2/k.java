package com.spotify.rxjava2;

import io.reactivex.functions.g;
import io.reactivex.t;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ k(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f((Throwable) obj);
    }
}
