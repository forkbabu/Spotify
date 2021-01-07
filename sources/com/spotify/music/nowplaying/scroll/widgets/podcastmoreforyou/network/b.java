package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

public final class b implements fjf<PodcastMoreForYouDataLoader> {
    private final wlf<c> a;
    private final wlf<d> b;

    public b(wlf<c> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastMoreForYouDataLoader(this.a.get(), this.b.get());
    }
}
