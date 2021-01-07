package com.spotify.music.nowplaying.common.view.ban;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class f implements fjf<e> {
    private final wlf<g<PlayerState>> a;
    private final wlf<s7a> b;
    private final wlf<hqd> c;
    private final wlf<d> d;

    public f(wlf<g<PlayerState>> wlf, wlf<s7a> wlf2, wlf<hqd> wlf3, wlf<d> wlf4) {
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
