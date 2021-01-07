package com.spotify.eventsender;

import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ m0 a;

    public /* synthetic */ k(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((Throwable) obj);
    }
}
