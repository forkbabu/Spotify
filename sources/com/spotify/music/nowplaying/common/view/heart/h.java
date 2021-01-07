package com.spotify.music.nowplaying.common.view.heart;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class h implements fjf<g> {
    private final wlf<g<PlayerState>> a;
    private final wlf<t8a> b;
    private final wlf<brd> c;
    private final wlf<f> d;

    public h(wlf<g<PlayerState>> wlf, wlf<t8a> wlf2, wlf<brd> wlf3, wlf<f> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
