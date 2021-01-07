package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector;

public final class d implements fjf<c> {
    private final wlf<EpisodeTypeViewSelector> a;
    private final wlf<fkc> b;

    public d(wlf<EpisodeTypeViewSelector> wlf, wlf<fkc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
