package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class i implements fjf<h> {
    private final wlf<g<PlayerState>> a;
    private final wlf<j> b;

    public i(wlf<g<PlayerState>> wlf, wlf<j> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
