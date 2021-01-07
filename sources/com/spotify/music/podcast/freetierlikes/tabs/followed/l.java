package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.music.podcast.freetierlikes.tabs.d;

public final class l implements fjf<k> {
    private final wlf<d> a;

    public l(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get());
    }
}
