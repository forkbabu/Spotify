package com.spotify.music.features.yourlibrary.musicpages.datasource;

import java.util.concurrent.Callable;

public final /* synthetic */ class e0 implements Callable {
    public final /* synthetic */ n3 a;

    public /* synthetic */ e0(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return n3.g(this.a);
    }
}
