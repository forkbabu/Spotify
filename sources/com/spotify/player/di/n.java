package com.spotify.player.di;

import androidx.lifecycle.Lifecycle;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class n implements fjf<RxRouter> {
    private final wlf<RxRouterProvider> a;
    private final wlf<Lifecycle> b;

    public n(wlf<RxRouterProvider> wlf, wlf<Lifecycle> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxRouter provideWithLifecycle = this.a.get().provideWithLifecycle(this.b.get());
        yif.g(provideWithLifecycle, "Cannot return null from a non-@Nullable @Provides method");
        return provideWithLifecycle;
    }
}
