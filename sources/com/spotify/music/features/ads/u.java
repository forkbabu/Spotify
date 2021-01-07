package com.spotify.music.features.ads;

import io.reactivex.functions.g;

public final /* synthetic */ class u implements g {
    public final /* synthetic */ p1 a;
    public final /* synthetic */ ys2 b;

    public /* synthetic */ u(p1 p1Var, ys2 ys2) {
        this.a = p1Var;
        this.b = ys2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Boolean) obj);
    }
}
