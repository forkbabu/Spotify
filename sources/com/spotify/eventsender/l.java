package com.spotify.eventsender;

import io.reactivex.functions.a;

public final /* synthetic */ class l implements a {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ l(m0 m0Var, q0 q0Var) {
        this.a = m0Var;
        this.b = q0Var;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.c(this.b);
    }
}
