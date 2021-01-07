package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.model.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ a b;

    public /* synthetic */ g(f0 f0Var, a aVar) {
        this.a = f0Var;
        this.b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.l(this.b);
    }
}
