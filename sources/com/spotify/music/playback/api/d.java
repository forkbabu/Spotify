package com.spotify.music.playback.api;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class d implements fjf<c> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;

    public d(wlf<g<PlayerState>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
