package com.spotify.cosmos.pubsub;

public final class PubSubCosmosClientImpl_Factory implements fjf<PubSubCosmosClientImpl> {
    private final wlf<PubSubEndpoint> mEndPointProvider;

    public PubSubCosmosClientImpl_Factory(wlf<PubSubEndpoint> wlf) {
        this.mEndPointProvider = wlf;
    }

    public static PubSubCosmosClientImpl_Factory create(wlf<PubSubEndpoint> wlf) {
        return new PubSubCosmosClientImpl_Factory(wlf);
    }

    public static PubSubCosmosClientImpl newInstance(PubSubEndpoint pubSubEndpoint) {
        return new PubSubCosmosClientImpl(pubSubEndpoint);
    }

    @Override // defpackage.wlf
    public PubSubCosmosClientImpl get() {
        return newInstance(this.mEndPointProvider.get());
    }
}
