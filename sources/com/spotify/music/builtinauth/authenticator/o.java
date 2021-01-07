package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.cache.a0;
import io.reactivex.functions.l;

public final /* synthetic */ class o implements l {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ o(i0 i0Var, a0 a0Var) {
        this.a = i0Var;
        this.b = a0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (Boolean) obj);
    }
}
