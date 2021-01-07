package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class PubSubCosmosModule_Companion_ProvidePubSubCosmosEndpointFactory implements fjf<PubSubEndpoint> {
    private final wlf<Cosmonaut> cosmonautProvider;

    public PubSubCosmosModule_Companion_ProvidePubSubCosmosEndpointFactory(wlf<Cosmonaut> wlf) {
        this.cosmonautProvider = wlf;
    }

    public static PubSubCosmosModule_Companion_ProvidePubSubCosmosEndpointFactory create(wlf<Cosmonaut> wlf) {
        return new PubSubCosmosModule_Companion_ProvidePubSubCosmosEndpointFactory(wlf);
    }

    public static PubSubEndpoint providePubSubCosmosEndpoint(Cosmonaut cosmonaut) {
        PubSubEndpoint providePubSubCosmosEndpoint = PubSubCosmosModule.Companion.providePubSubCosmosEndpoint(cosmonaut);
        yif.g(providePubSubCosmosEndpoint, "Cannot return null from a non-@Nullable @Provides method");
        return providePubSubCosmosEndpoint;
    }

    @Override // defpackage.wlf
    public PubSubEndpoint get() {
        return providePubSubCosmosEndpoint(this.cosmonautProvider.get());
    }
}
