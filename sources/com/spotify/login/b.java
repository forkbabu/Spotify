package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (u0) ((LoginResponse) obj).map(f.a, r.a, q.a, a0.a, e.a);
    }
}
