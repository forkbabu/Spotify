package com.spotify.music.features.podcast.episode;

import com.spotify.music.podcast.episode.util.e;
import com.spotify.music.podcast.episode.util.j;

public final class k0 implements fjf<j0> {
    private final wlf<j> a;
    private final wlf<e> b;

    public k0(wlf<j> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j0(this.a.get(), this.b.get());
    }
}
