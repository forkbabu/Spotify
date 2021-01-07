package com.spotify.music.homecomponents.singleitem;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ j a;

    public /* synthetic */ b(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.h();
    }
}
