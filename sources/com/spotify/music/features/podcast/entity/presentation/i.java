package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.navigation.t;

public final class i implements fjf<h> {
    private final wlf<t> a;
    private final wlf<String> b;

    public i(wlf<t> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
