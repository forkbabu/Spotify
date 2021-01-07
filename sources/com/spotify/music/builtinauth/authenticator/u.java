package com.spotify.music.builtinauth.authenticator;

import io.reactivex.b;
import io.reactivex.d;

public final /* synthetic */ class u implements d {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ u(l0 l0Var, d0 d0Var) {
        this.a = l0Var;
        this.b = d0Var;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.c(this.b, bVar);
    }
}
