package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.music.podcast.episode.util.j;

public final class h implements fjf<g> {
    private final wlf<j> a;

    public h(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
