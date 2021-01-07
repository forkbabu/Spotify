package com.spotify.music.libs.collection.service;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ v a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b(v vVar, Runnable runnable) {
        this.a = vVar;
        this.b = runnable;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.l(this.b, (String) obj);
    }
}
