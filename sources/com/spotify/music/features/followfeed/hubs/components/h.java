package com.spotify.music.features.followfeed.hubs.components;

import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.views.c;

public final class h implements fjf<g> {
    private final wlf<c> a;
    private final wlf<b> b;

    public h(wlf<c> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
