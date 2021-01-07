package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.n;

public final /* synthetic */ class j1 implements n {
    public static final /* synthetic */ j1 a = new j1();

    private /* synthetic */ j1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        x3 x3Var = (x3) obj;
        return x3Var.c().f() || x3Var.c().b().containsValue(Boolean.TRUE);
    }
}
