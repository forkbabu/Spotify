package com.spotify.imageresolve;

import com.spotify.http.u;

public final class x implements fjf<w> {
    private final wlf<u> a;
    private final wlf<c0> b;
    private final wlf<b0> c;

    public x(wlf<u> wlf, wlf<c0> wlf2, wlf<b0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get(), this.c.get());
    }
}
