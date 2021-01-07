package com.spotify.cosmos.router.di;

import androidx.fragment.app.Fragment;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public final class RxRouterFragmentModule_ProvideRouterFactory implements fjf<RxRouter> {
    private final wlf<Fragment> fragmentProvider;
    private final wlf<RxRouterProvider> providerProvider;

    public RxRouterFragmentModule_ProvideRouterFactory(wlf<RxRouterProvider> wlf, wlf<Fragment> wlf2) {
        this.providerProvider = wlf;
        this.fragmentProvider = wlf2;
    }

    public static RxRouterFragmentModule_ProvideRouterFactory create(wlf<RxRouterProvider> wlf, wlf<Fragment> wlf2) {
        return new RxRouterFragmentModule_ProvideRouterFactory(wlf, wlf2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, Fragment fragment) {
        RxRouter provideWithLifecycle = rxRouterProvider.provideWithLifecycle(fragment.A());
        yif.g(provideWithLifecycle, "Cannot return null from a non-@Nullable @Provides method");
        return provideWithLifecycle;
    }

    @Override // defpackage.wlf
    public RxRouter get() {
        return provideRouter(this.providerProvider.get(), this.fragmentProvider.get());
    }
}
