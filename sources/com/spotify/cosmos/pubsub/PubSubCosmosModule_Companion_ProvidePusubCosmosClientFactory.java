package com.spotify.cosmos.pubsub;

public final class PubSubCosmosModule_Companion_ProvidePusubCosmosClientFactory implements fjf<PubSubCosmosClient> {
    private final wlf<PubSubEndpoint> endPointProvider;

    public PubSubCosmosModule_Companion_ProvidePusubCosmosClientFactory(wlf<PubSubEndpoint> wlf) {
        this.endPointProvider = wlf;
    }

    public static PubSubCosmosModule_Companion_ProvidePusubCosmosClientFactory create(wlf<PubSubEndpoint> wlf) {
        return new PubSubCosmosModule_Companion_ProvidePusubCosmosClientFactory(wlf);
    }

    public static PubSubCosmosClient providePusubCosmosClient(PubSubEndpoint pubSubEndpoint) {
        PubSubCosmosClient providePusubCosmosClient = PubSubCosmosModule.Companion.providePusubCosmosClient(pubSubEndpoint);
        yif.g(providePusubCosmosClient, "Cannot return null from a non-@Nullable @Provides method");
        return providePusubCosmosClient;
    }

    @Override // defpackage.wlf
    public PubSubCosmosClient get() {
        return providePusubCosmosClient(this.endPointProvider.get());
    }
}
