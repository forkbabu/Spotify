package com.spotify.cosmos.router.internal;

import android.content.Context;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;

public final class CosmosServiceRxRouterClient_Factory implements fjf<CosmosServiceRxRouterClient> {
    private final wlf<Context> contextProvider;
    private final wlf<CosmosServiceIntentBuilder> cosmosServiceIntentBuilderProvider;

    public CosmosServiceRxRouterClient_Factory(wlf<Context> wlf, wlf<CosmosServiceIntentBuilder> wlf2) {
        this.contextProvider = wlf;
        this.cosmosServiceIntentBuilderProvider = wlf2;
    }

    public static CosmosServiceRxRouterClient_Factory create(wlf<Context> wlf, wlf<CosmosServiceIntentBuilder> wlf2) {
        return new CosmosServiceRxRouterClient_Factory(wlf, wlf2);
    }

    public static CosmosServiceRxRouterClient newInstance(Context context, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new CosmosServiceRxRouterClient(context, cosmosServiceIntentBuilder);
    }

    @Override // defpackage.wlf
    public CosmosServiceRxRouterClient get() {
        return newInstance(this.contextProvider.get(), this.cosmosServiceIntentBuilderProvider.get());
    }
}
