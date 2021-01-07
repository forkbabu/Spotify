package com.spotify.cosmos.android;

import com.spotify.cosmos.android.util.CosmosRequestInterceptor;
import com.spotify.cosmos.android.util.CosmosRequestObserver;

public final class Cosmos {
    public static final String ACTION_COSMOS_PROXY = "com.spotify.mobile.service.action.COSMOS_PROXY";

    private Cosmos() {
    }

    public static void clearInterceptor() {
        RemoteNativeRouter.clearInterceptor();
    }

    public static CosmosRequestInterceptor getInterceptor() {
        return RemoteNativeRouter.getInterceptor();
    }

    public static void setInterceptor(CosmosRequestInterceptor cosmosRequestInterceptor) {
        cosmosRequestInterceptor.getClass();
        RemoteNativeRouter.setInterceptor(cosmosRequestInterceptor);
    }

    public static void setObserver(CosmosRequestObserver cosmosRequestObserver) {
        RemoteNativeRouter.setObserver(cosmosRequestObserver);
    }
}
