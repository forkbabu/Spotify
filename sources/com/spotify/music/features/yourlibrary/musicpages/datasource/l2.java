package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;

public final /* synthetic */ class l2 implements l {
    public final /* synthetic */ c5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x3 c;

    public /* synthetic */ l2(c5 c5Var, int i, x3 x3Var) {
        this.a = c5Var;
        this.b = i;
        this.c = x3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.m(this.b, this.c, (eg9) obj);
    }
}
