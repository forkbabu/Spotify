package com.spotify.music.libs.common.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((Throwable) obj);
    }
}
