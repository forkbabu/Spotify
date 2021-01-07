package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;

public final /* synthetic */ class u implements l {
    public final /* synthetic */ l3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x3 c;

    public /* synthetic */ u(l3 l3Var, int i, x3 x3Var) {
        this.a = l3Var;
        this.b = i;
        this.c = x3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.m(this.b, this.c, (eg9) obj);
    }
}
