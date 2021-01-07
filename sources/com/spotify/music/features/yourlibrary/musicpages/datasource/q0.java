package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class q0 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ s b;

    public /* synthetic */ q0(e4 e4Var, s sVar) {
        this.a = e4Var;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (Boolean) obj);
    }
}
