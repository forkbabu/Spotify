package com.spotify.podcast.endpoints.collection;

import com.spotify.podcast.endpoints.u;

public final class g implements fjf<f> {
    private final wlf<e> a;
    private final wlf<u> b;

    public g(wlf<e> wlf, wlf<u> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
