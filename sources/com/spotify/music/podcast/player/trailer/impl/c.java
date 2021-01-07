package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class c implements fjf<PlayerApiPodcastTrailerPlayer> {
    private final wlf<g<PlayerState>> a;
    private final wlf<i> b;
    private final wlf<cqe> c;
    private final wlf<String> d;
    private final wlf<k> e;

    public c(wlf<g<PlayerState>> wlf, wlf<i> wlf2, wlf<cqe> wlf3, wlf<String> wlf4, wlf<k> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayerApiPodcastTrailerPlayer(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
