package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public final /* synthetic */ j3 a;

    public /* synthetic */ m(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return j3.e(this.a, ((Integer) obj).intValue());
    }
}
