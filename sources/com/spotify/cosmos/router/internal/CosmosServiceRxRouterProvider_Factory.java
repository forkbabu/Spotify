package com.spotify.cosmos.router.internal;

public final class CosmosServiceRxRouterProvider_Factory implements fjf<CosmosServiceRxRouterProvider> {
    private final wlf<CosmosServiceRxRouter> factoryProvider;

    public CosmosServiceRxRouterProvider_Factory(wlf<CosmosServiceRxRouter> wlf) {
        this.factoryProvider = wlf;
    }

    public static CosmosServiceRxRouterProvider_Factory create(wlf<CosmosServiceRxRouter> wlf) {
        return new CosmosServiceRxRouterProvider_Factory(wlf);
    }

    public static CosmosServiceRxRouterProvider newInstance(wlf<CosmosServiceRxRouter> wlf) {
        return new CosmosServiceRxRouterProvider(wlf);
    }

    @Override // defpackage.wlf
    public CosmosServiceRxRouterProvider get() {
        return newInstance(this.factoryProvider);
    }
}
