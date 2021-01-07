package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.podcast.endpoints.i0;

public final class g implements fjf<f> {
    private final wlf<i0> a;

    public g(wlf<i0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
