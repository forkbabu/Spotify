package com.spotify.music.builtinauth.authenticator;

import io.reactivex.functions.a;

public final /* synthetic */ class m implements a {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ com.spotify.music.builtinauth.model.a b;

    public /* synthetic */ m(f0 f0Var, com.spotify.music.builtinauth.model.a aVar) {
        this.a = f0Var;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b);
    }
}
