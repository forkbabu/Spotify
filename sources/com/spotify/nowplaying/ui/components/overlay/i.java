package com.spotify.nowplaying.ui.components.overlay;

import io.reactivex.g;

public final class i implements fjf<h> {
    private final wlf<g<j>> a;

    public i(wlf<g<j>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get());
    }
}
