package com.spotify.music.features.editplaylist.operations;

import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ g(m0 m0Var, l0 l0Var) {
        this.a = m0Var;
        this.b = l0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.f(this.b);
    }
}
