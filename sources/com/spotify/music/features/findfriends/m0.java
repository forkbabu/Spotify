package com.spotify.music.features.findfriends;

import io.reactivex.functions.n;

public final /* synthetic */ class m0 implements n {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        p0 p0Var = (p0) obj;
        if (!p0Var.c().isPresent()) {
            return false;
        }
        if (!p0Var.c().get().enabled() || p0Var.a().isPresent() || p0Var.b().isPresent()) {
            return true;
        }
        return false;
    }
}
