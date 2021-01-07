package com.spotify.music.features.search.mobius;

import com.spotify.libs.search.history.i;
import com.spotify.music.navigation.t;

public final class r0 implements fjf<q0> {
    private final wlf<uxa> a;
    private final wlf<fb8> b;
    private final wlf<Boolean> c;
    private final wlf<u0> d;
    private final wlf<i> e;
    private final wlf<t> f;
    private final wlf<qd8> g;
    private final wlf<z0> h;

    public r0(wlf<uxa> wlf, wlf<fb8> wlf2, wlf<Boolean> wlf3, wlf<u0> wlf4, wlf<i> wlf5, wlf<t> wlf6, wlf<qd8> wlf7, wlf<z0> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q0(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
