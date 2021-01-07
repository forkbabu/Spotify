package com.spotify.music.podcast.freetierlikes.tabs.episodes;

public final class v implements fjf<u> {
    private final wlf<EpisodeTypeViewSelector> a;
    private final wlf<fkc> b;

    public v(wlf<EpisodeTypeViewSelector> wlf, wlf<fkc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get());
    }
}
