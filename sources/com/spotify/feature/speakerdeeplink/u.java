package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.j;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class u implements fjf<t> {
    private final wlf<g<PlayerState>> a;
    private final wlf<j> b;
    private final wlf<zr0> c;
    private final wlf<km0> d;
    private final wlf<q> e;
    private final wlf<y> f;

    public u(wlf<g<PlayerState>> wlf, wlf<j> wlf2, wlf<zr0> wlf3, wlf<km0> wlf4, wlf<q> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
