package com.spotify.music.features.goldenpath.referencetoplist;

import io.reactivex.y;

public final class m implements fjf<o> {
    private final wlf<d> a;
    private final wlf<g> b;
    private final wlf<y> c;

    public m(wlf<d> wlf, wlf<g> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        int i = h.a;
        return new o(this.a.get().a(), this.b.get(), this.c.get());
    }
}
