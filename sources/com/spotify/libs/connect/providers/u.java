package com.spotify.libs.connect.providers;

import com.spotify.music.spotlets.offline.util.c;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class u implements fjf<t> {
    private final wlf<g<PlayerState>> a;
    private final wlf<gs0> b;
    private final wlf<c> c;

    public u(wlf<g<PlayerState>> wlf, wlf<gs0> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get());
    }
}
