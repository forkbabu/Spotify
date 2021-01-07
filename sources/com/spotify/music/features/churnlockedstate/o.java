package com.spotify.music.features.churnlockedstate;

import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {
    public final /* synthetic */ u a;

    public /* synthetic */ o(u uVar) {
        this.a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.a.b());
    }
}
