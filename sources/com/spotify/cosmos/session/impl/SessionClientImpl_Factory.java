package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

public final class SessionClientImpl_Factory implements fjf<SessionClientImpl> {
    private final wlf<Cosmonaut> cosmonautProvider;
    private final wlf<RxRouter> rxRouterProvider;

    public SessionClientImpl_Factory(wlf<Cosmonaut> wlf, wlf<RxRouter> wlf2) {
        this.cosmonautProvider = wlf;
        this.rxRouterProvider = wlf2;
    }

    public static SessionClientImpl_Factory create(wlf<Cosmonaut> wlf, wlf<RxRouter> wlf2) {
        return new SessionClientImpl_Factory(wlf, wlf2);
    }

    public static SessionClientImpl newInstance(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return new SessionClientImpl(cosmonaut, rxRouter);
    }

    @Override // defpackage.wlf
    public SessionClientImpl get() {
        return newInstance(this.cosmonautProvider.get(), this.rxRouterProvider.get());
    }
}
