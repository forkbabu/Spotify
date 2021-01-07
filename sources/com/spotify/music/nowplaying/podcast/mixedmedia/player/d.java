package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class d implements fjf<PodcastMixedMediaPlayerHelperImpl> {
    private final wlf<g<PlayerState>> a;
    private final wlf<com.spotify.player.controls.d> b;
    private final wlf<i> c;

    public d(wlf<g<PlayerState>> wlf, wlf<com.spotify.player.controls.d> wlf2, wlf<i> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastMixedMediaPlayerHelperImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
