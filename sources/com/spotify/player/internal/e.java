package com.spotify.player.internal;

import com.spotify.cosmos.router.RxRouter;

public final class e implements fjf<PlayerCommandResolverImpl> {
    private final wlf<RxRouter> a;
    private final wlf<pxd> b;

    public e(wlf<RxRouter> wlf, wlf<pxd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlayerCommandResolverImpl(this.a.get(), this.b.get());
    }
}
