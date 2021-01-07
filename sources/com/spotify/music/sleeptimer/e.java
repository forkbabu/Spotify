package com.spotify.music.sleeptimer;

import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ o a;

    public /* synthetic */ e(o oVar) {
        this.a = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.h();
    }
}
