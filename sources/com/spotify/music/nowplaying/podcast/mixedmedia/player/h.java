package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class h implements fjf<g> {
    private final wlf<g<PlayerState>> a;

    public h(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
