package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.f;
import com.spotify.music.podcast.freetierlikes.tabs.followed.x;

public final class i implements fjf<h> {
    private final wlf<f> a;
    private final wlf<c> b;
    private final wlf<x> c;

    public i(wlf<f> wlf, wlf<c> wlf2, wlf<x> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
