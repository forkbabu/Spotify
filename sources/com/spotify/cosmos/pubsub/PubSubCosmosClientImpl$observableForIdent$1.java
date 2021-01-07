package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.pubsub.model.PubSub;
import com.spotify.cosmos.pubsub.model.PubSubResponse;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class PubSubCosmosClientImpl$observableForIdent$1<T, R> implements l<PubSubResponse, PubSub> {
    final /* synthetic */ String $ident;
    final /* synthetic */ PubSubCosmosClientImpl this$0;

    PubSubCosmosClientImpl$observableForIdent$1(PubSubCosmosClientImpl pubSubCosmosClientImpl, String str) {
        this.this$0 = pubSubCosmosClientImpl;
        this.$ident = str;
    }

    public final PubSub apply(PubSubResponse pubSubResponse) {
        h.e(pubSubResponse, "obj");
        return this.this$0.convert(this.$ident, pubSubResponse);
    }
}
