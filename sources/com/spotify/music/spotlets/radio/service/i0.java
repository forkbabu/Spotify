package com.spotify.music.spotlets.radio.service;

import io.reactivex.y;

public final class i0 implements fjf<h0> {
    private final wlf<k0> a;
    private final wlf<yfd> b;
    private final wlf<y> c;

    public i0(wlf<k0> wlf, wlf<yfd> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get(), this.c.get());
    }
}
