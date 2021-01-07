package com.spotify.music.libs.performance.tracking;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ i0 a;

    public /* synthetic */ j(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.h();
    }
}
