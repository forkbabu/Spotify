package com.spotify.cosmos.router.internal;

public final class CosmosServiceRxRouter_Factory implements fjf<CosmosServiceRxRouter> {
    private final wlf<RxRouterClient> serviceClientProvider;

    public CosmosServiceRxRouter_Factory(wlf<RxRouterClient> wlf) {
        this.serviceClientProvider = wlf;
    }

    public static CosmosServiceRxRouter_Factory create(wlf<RxRouterClient> wlf) {
        return new CosmosServiceRxRouter_Factory(wlf);
    }

    public static CosmosServiceRxRouter newInstance(RxRouterClient rxRouterClient) {
        return new CosmosServiceRxRouter(rxRouterClient);
    }

    @Override // defpackage.wlf
    public CosmosServiceRxRouter get() {
        return newInstance(this.serviceClientProvider.get());
    }
}
