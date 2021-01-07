package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.cache.a0;
import io.reactivex.functions.n;

public final /* synthetic */ class p implements n {
    public final /* synthetic */ i0 a;

    public /* synthetic */ p(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return i0.c(this.a, (a0) obj);
    }
}
