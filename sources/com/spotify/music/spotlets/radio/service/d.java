package com.spotify.music.spotlets.radio.service;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ d(d0 d0Var, String[] strArr) {
        this.a = d0Var;
        this.b = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, (Throwable) obj);
    }
}
