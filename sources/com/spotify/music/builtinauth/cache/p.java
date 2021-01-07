package com.spotify.music.builtinauth.cache;

import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ p(r0 r0Var, a0 a0Var) {
        this.a = r0Var;
        this.b = a0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (Throwable) obj);
    }
}
