package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.cache.a0;
import io.reactivex.functions.n;

public final /* synthetic */ class t implements n {
    public final /* synthetic */ a0 a;

    public /* synthetic */ t(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((a0) obj).h().containsAll(this.a.h());
    }
}
