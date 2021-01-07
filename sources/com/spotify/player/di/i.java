package com.spotify.player.di;

import com.spotify.cosmos.router.RxRouterProvider;
import com.spotify.remoteconfig.rj;

public final class i implements fjf<h> {
    private final wlf<pxd> a;
    private final wlf<RxRouterProvider> b;
    private final wlf<cqe> c;
    private final wlf<rj> d;

    public i(wlf<pxd> wlf, wlf<RxRouterProvider> wlf2, wlf<cqe> wlf3, wlf<rj> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
