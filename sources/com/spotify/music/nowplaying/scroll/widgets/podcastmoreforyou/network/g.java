package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

public final class g implements fjf<f> {
    private final wlf<PodcastMoreForYouDataLoader> a;

    public g(wlf<PodcastMoreForYouDataLoader> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
