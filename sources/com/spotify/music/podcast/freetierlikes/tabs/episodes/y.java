package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.d;

public final class y implements fjf<x> {
    private final wlf<d> a;

    public y(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x(this.a.get());
    }
}
