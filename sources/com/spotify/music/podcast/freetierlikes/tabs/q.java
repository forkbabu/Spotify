package com.spotify.music.podcast.freetierlikes.tabs;

import com.spotify.music.podcast.freetierlikes.tabs.downloads.f;
import com.spotify.music.podcast.freetierlikes.tabs.episodes.x;
import com.spotify.music.podcast.freetierlikes.tabs.followed.k;

public final class q implements fjf<p> {
    private final wlf<f> a;
    private final wlf<x> b;
    private final wlf<k> c;

    public q(wlf<f> wlf, wlf<x> wlf2, wlf<k> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get());
    }
}
