package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;

public final /* synthetic */ class y2 implements l {
    public final /* synthetic */ h5 a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ y2(h5 h5Var, x3 x3Var) {
        this.a = h5Var;
        this.b = x3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.m(this.b, (eg9) obj);
    }
}
