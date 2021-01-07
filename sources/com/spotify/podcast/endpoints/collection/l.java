package com.spotify.podcast.endpoints.collection;

import com.spotify.podcast.endpoints.u;

public final class l implements fjf<k> {
    private final wlf<j> a;
    private final wlf<u> b;

    public l(wlf<j> wlf, wlf<u> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
