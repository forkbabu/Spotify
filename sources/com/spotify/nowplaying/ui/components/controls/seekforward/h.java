package com.spotify.nowplaying.ui.components.controls.seekforward;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class h implements fjf<g> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<f> c;
    private final wlf<cqe> d;

    public h(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<f> wlf3, wlf<cqe> wlf4) {
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
