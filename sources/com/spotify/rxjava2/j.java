package com.spotify.rxjava2;

import io.reactivex.functions.g;
import io.reactivex.h;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ j(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext(obj);
    }
}
