package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.model.a;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ a b;

    public /* synthetic */ f(f0 f0Var, a aVar) {
        this.a = f0Var;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (Throwable) obj);
    }
}
