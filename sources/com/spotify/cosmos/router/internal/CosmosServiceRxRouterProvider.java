package com.spotify.cosmos.router.internal;

import androidx.lifecycle.Lifecycle;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

public class CosmosServiceRxRouterProvider implements RxRouterProvider {
    private final wlf<CosmosServiceRxRouter> mRouterFactory;

    public CosmosServiceRxRouterProvider(wlf<CosmosServiceRxRouter> wlf) {
        this.mRouterFactory = wlf;
    }

    @Override // com.spotify.cosmos.router.RxRouterProvider
    public RxRouter provideWithLifecycle(Lifecycle lifecycle) {
        CosmosServiceRxRouter cosmosServiceRxRouter = this.mRouterFactory.get();
        lifecycle.a(new RouterLifecycleObserver(cosmosServiceRxRouter));
        return cosmosServiceRxRouter;
    }
}
