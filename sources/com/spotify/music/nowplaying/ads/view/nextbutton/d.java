package com.spotify.music.nowplaying.ads.view.nextbutton;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class d implements fjf<c> {
    private final wlf<g<Boolean>> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<uec> c;
    private final wlf<e> d;

    public d(wlf<g<Boolean>> wlf, wlf<g<PlayerState>> wlf2, wlf<uec> wlf3, wlf<e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
