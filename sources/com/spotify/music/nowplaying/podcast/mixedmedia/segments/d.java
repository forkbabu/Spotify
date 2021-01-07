package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.api.a;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<PlayerState>> a;
    private final wlf<a> b;

    public d(wlf<g<PlayerState>> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
