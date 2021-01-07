package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class v implements l {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (w0) ((LoginResponse) obj).map(p.a, j0.a, c0.a, o.a, z.a);
    }
}
