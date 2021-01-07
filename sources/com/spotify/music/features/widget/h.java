package com.spotify.music.features.widget;

import com.spotify.player.controls.d;
import com.spotify.ubi.specification.factories.p;

public final class h implements fjf<g> {
    private final wlf<d> a;
    private final wlf<ere> b;
    private final wlf<p> c;

    public h(wlf<d> wlf, wlf<ere> wlf2, wlf<p> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a, this.b.get(), this.c.get());
    }
}
