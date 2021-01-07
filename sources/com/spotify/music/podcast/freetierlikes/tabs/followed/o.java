package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.podcast.endpoints.c0;

public final class o implements fjf<n> {
    private final wlf<c0> a;
    private final wlf<String> b;
    private final wlf<c0.a> c;

    public o(wlf<c0> wlf, wlf<String> wlf2, wlf<c0.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get());
    }
}
