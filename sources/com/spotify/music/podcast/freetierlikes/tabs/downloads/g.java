package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import com.spotify.music.podcast.freetierlikes.tabs.d;

public final class g implements fjf<f> {
    private final wlf<d> a;

    public g(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
