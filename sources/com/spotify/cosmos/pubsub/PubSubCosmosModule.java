package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import kotlin.jvm.internal.h;

public interface PubSubCosmosModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PubSubEndpoint providePubSubCosmosEndpoint(Cosmonaut cosmonaut) {
            return (PubSubEndpoint) je.c0(cosmonaut, "cosmonaut", PubSubEndpoint.class, "cosmonaut.createCosmosSe…bSubEndpoint::class.java)");
        }

        public final PubSubCosmosClient providePusubCosmosClient(PubSubEndpoint pubSubEndpoint) {
            h.e(pubSubEndpoint, "endPoint");
            return new PubSubCosmosClientImpl(pubSubEndpoint);
        }
    }
}
