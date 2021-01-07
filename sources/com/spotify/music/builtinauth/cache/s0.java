package com.spotify.music.builtinauth.cache;

import com.spotify.music.builtinauth.authenticator.l0;
import com.spotify.music.builtinauth.authenticator.n0;

public final class s0 implements fjf<r0> {
    private final wlf<l0> a;
    private final wlf<l0> b;
    private final wlf<cqe> c;
    private final wlf<n0> d;
    private final wlf<jl2> e;

    public s0(wlf<l0> wlf, wlf<l0> wlf2, wlf<cqe> wlf3, wlf<n0> wlf4, wlf<jl2> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
