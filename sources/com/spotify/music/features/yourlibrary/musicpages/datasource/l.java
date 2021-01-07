package com.spotify.music.features.yourlibrary.musicpages.datasource;

import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {
    public final /* synthetic */ j3 a;

    public /* synthetic */ l(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return j3.a(this.a);
    }
}
