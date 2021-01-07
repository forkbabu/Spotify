package com.spotify.music.features.eventshub.eventshub;

import com.spotify.ubi.specification.factories.j0;

public final class i implements fjf<h> {
    private final wlf<jz1> a;
    private final wlf<ere> b;
    private final wlf<j0> c;
    private final wlf<cqe> d;

    public i(wlf<jz1> wlf, wlf<ere> wlf2, wlf<j0> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
