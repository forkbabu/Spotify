package com.spotify.effortlesslogin.prerequisites;

import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<i> a;
    private final wlf<Boolean> b;
    private final wlf<y> c;
    private final wlf<y> d;

    public h(wlf<i> wlf, wlf<Boolean> wlf2, wlf<y> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get().booleanValue(), this.c.get(), this.d.get());
    }
}
