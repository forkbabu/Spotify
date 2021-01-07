package com.spotify.music.nowplaying.common.view.queue;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<PlayerState>> a;
    private final wlf<nsb> b;
    private final wlf<crd> c;

    public d(wlf<g<PlayerState>> wlf, wlf<nsb> wlf2, wlf<crd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
