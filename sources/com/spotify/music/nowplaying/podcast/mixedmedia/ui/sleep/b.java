package com.spotify.music.nowplaying.podcast.mixedmedia.ui.sleep;

import com.spotify.music.nowplaying.podcast.sleeptimer.d;
import com.spotify.music.sleeptimer.n;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class b implements fjf<PodcastMixedMediaSleepTimerButtonPresenter> {
    private final wlf<g<PlayerState>> a;
    private final wlf<n> b;
    private final wlf<d> c;
    private final wlf<c2c> d;
    private final wlf<y> e;
    private final wlf<p0c> f;

    public b(wlf<g<PlayerState>> wlf, wlf<n> wlf2, wlf<d> wlf3, wlf<c2c> wlf4, wlf<y> wlf5, wlf<p0c> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastMixedMediaSleepTimerButtonPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
