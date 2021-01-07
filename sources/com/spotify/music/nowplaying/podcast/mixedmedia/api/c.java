package com.spotify.music.nowplaying.podcast.mixedmedia.api;

import com.spotify.podcast.endpoints.v;

public final class c implements fjf<PodcastSegmentsRepositoryImpl> {
    private final wlf<v> a;

    public c(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastSegmentsRepositoryImpl(this.a.get());
    }
}
