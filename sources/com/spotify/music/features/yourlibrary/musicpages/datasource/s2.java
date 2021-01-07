package com.spotify.music.features.yourlibrary.musicpages.datasource;

import java.util.concurrent.Callable;

public final /* synthetic */ class s2 implements Callable {
    public final /* synthetic */ f5 a;

    public /* synthetic */ s2(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f5.e(this.a);
    }
}
