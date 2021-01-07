package com.spotify.cosmos.router.di;

import androidx.fragment.app.c;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterActivityModule_ProvideRouterFactory implements fjf<RxRouter> {
    private final wlf<c> activityProvider;
    private final wlf<RxRouterProvider> providerProvider;

    public RxRouterActivityModule_ProvideRouterFactory(wlf<RxRouterProvider> wlf, wlf<c> wlf2) {
        this.providerProvider = wlf;
        this.activityProvider = wlf2;
    }

    public static RxRouterActivityModule_ProvideRouterFactory create(wlf<RxRouterProvider> wlf, wlf<c> wlf2) {
        return new RxRouterActivityModule_ProvideRouterFactory(wlf, wlf2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, c cVar) {
        RxRouter provideWithLifecycle = rxRouterProvider.provideWithLifecycle(cVar.A());
        yif.g(provideWithLifecycle, "Cannot return null from a non-@Nullable @Provides method");
        return provideWithLifecycle;
    }

    @Override // defpackage.wlf
    public RxRouter get() {
        return provideRouter(this.providerProvider.get(), this.activityProvider.get());
    }
}
