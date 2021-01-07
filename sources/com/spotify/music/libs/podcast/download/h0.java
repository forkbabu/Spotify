package com.spotify.music.libs.podcast.download;

import com.spotify.music.settings.a;

public final class h0 implements fjf<g0> {
    private final wlf<a> a;
    private final wlf<v> b;

    public h0(wlf<a> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g0(this.a.get(), this.b.get());
    }
}
