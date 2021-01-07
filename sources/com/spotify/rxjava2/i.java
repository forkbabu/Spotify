package com.spotify.rxjava2;

import io.reactivex.functions.g;
import io.reactivex.t;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ i(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext(obj);
    }
}
