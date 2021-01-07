package com.spotify.music.marquee.trigger;

import io.reactivex.functions.n;

public final /* synthetic */ class j implements n {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        u3 u3Var = (u3) obj;
        return (u3Var.a == null || u3Var.b == null) ? false : true;
    }
}
