package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.pubsub.model.PubSub;
import com.spotify.cosmos.pubsub.model.PubSubResponse;
import io.reactivex.s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class PubSubCosmosClientImpl implements PubSubCosmosClient {
    private final PubSubEndpoint mEndPoint;

    public PubSubCosmosClientImpl(PubSubEndpoint pubSubEndpoint) {
        h.e(pubSubEndpoint, "mEndPoint");
        this.mEndPoint = pubSubEndpoint;
    }

    public final PubSub convert(String str, PubSubResponse pubSubResponse) {
        h.e(str, "ident");
        h.e(pubSubResponse, "pubSubResponse");
        if (pubSubResponse.getErrorCode() == null) {
            String ident = pubSubResponse.getIdent();
            h.c(ident);
            List<String> payload = pubSubResponse.getPayload();
            h.c(payload);
            Map<String, String> attributes = pubSubResponse.getAttributes();
            h.c(attributes);
            return new PubSub(ident, payload, attributes);
        }
        throw new IllegalStateException(je.x0("Recieved broken pubsub message for ident %s", str));
    }

    @Override // com.spotify.cosmos.pubsub.PubSubCosmosClient
    public s<PubSub> observableForIdent(String str) {
        h.e(str, "ident");
        s<R> q0 = this.mEndPoint.notifications(str).j0(new PubSubCosmosClientImpl$observableForIdent$1(this, str)).q0(new PubSubCosmosClientImpl$observableForIdent$2(str));
        h.d(q0, "mEndPoint\n            .n…          )\n            }");
        return q0;
    }
}
