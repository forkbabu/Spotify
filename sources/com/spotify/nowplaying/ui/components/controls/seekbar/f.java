package com.spotify.nowplaying.ui.components.controls.seekbar;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<e> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<g<dqd>> c;
    private final wlf<h> d;

    public f(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<g<dqd>> wlf3, wlf<h> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
