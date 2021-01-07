package com.spotify.music.podcastentityrow;

import com.spotify.music.libs.collection.played.a;
import com.spotify.music.podcast.episode.util.h;

public final class l implements fjf<k> {
    private final wlf<a> a;
    private final wlf<h> b;
    private final wlf<m> c;

    public l(wlf<a> wlf, wlf<h> wlf2, wlf<m> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), ejf.a(this.c));
    }
}
