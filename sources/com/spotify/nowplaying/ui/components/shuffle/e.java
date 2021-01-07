package com.spotify.nowplaying.ui.components.shuffle;

import com.spotify.player.model.PlayerState;
import com.spotify.player.options.d;
import io.reactivex.g;

public final class e implements fjf<d> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<c> c;

    public e(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
