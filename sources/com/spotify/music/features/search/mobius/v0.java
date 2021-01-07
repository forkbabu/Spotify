package com.spotify.music.features.search.mobius;

import com.spotify.libs.search.history.h;

public final class v0 implements fjf<u0> {
    private final wlf<sg0<jua, b91>> a;
    private final wlf<o0> b;
    private final wlf<h> c;
    private final wlf<qqa> d;
    private final wlf<sg0<b91, b91>> e;

    public v0(wlf<sg0<jua, b91>> wlf, wlf<o0> wlf2, wlf<h> wlf3, wlf<qqa> wlf4, wlf<sg0<b91, b91>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
