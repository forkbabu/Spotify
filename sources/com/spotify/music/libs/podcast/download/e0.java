package com.spotify.music.libs.podcast.download;

import com.spotify.playlist.endpoints.p;

public final class e0 implements fjf<d0> {
    private final wlf<g0> a;
    private final wlf<p> b;

    public e0(wlf<g0> wlf, wlf<p> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get(), this.b.get());
    }
}
