package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class m0 implements l {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (x0) ((LoginResponse) obj).map(d.a, h.a, g.a, k0.a, l0.a);
    }
}
