package com.spotify.player.internal;

import com.spotify.cosmos.router.RxRouter;

public final class i implements fjf<PlayerSessionCommandResolverImpl> {
    private final wlf<RxRouter> a;
    private final wlf<pxd> b;

    public i(wlf<RxRouter> wlf, wlf<pxd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayerSessionCommandResolverImpl(this.a.get(), this.b.get());
    }
}
