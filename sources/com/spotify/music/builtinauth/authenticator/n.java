package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.model.a;
import io.reactivex.functions.l;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ a b;

    public /* synthetic */ n(f0 f0Var, a aVar) {
        this.a = f0Var;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i(this.b, (Boolean) obj);
    }
}
