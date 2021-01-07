package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.s;

public final /* synthetic */ class p2 implements g {
    public final /* synthetic */ f5 a;
    public final /* synthetic */ s b;

    public /* synthetic */ p2(f5 f5Var, s sVar) {
        this.a = f5Var;
        this.b = sVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (b) obj);
    }
}
