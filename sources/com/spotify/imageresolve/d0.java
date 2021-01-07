package com.spotify.imageresolve;

import io.reactivex.y;

public final class d0 implements fjf<c0> {
    private final wlf<b0> a;
    private final wlf<y> b;

    public d0(wlf<b0> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get());
    }
}
