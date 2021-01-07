package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.cache.l0;

public final class j0 implements fjf<i0> {
    private final wlf<l0> a;
    private final wlf<com.spotify.music.builtinauth.cache.j0> b;
    private final wlf<cqe> c;

    public j0(wlf<l0> wlf, wlf<com.spotify.music.builtinauth.cache.j0> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static i0 a(l0 l0Var, com.spotify.music.builtinauth.cache.j0 j0Var, cqe cqe) {
        return new i0(l0Var, j0Var, cqe);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0(this.a.get(), this.b.get(), this.c.get());
    }
}
