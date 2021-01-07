package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.pubsub.model.PubSub;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;

final class PubSubCosmosClientImpl$observableForIdent$2<T, R> implements l<Throwable, v<? extends PubSub>> {
    final /* synthetic */ String $ident;

    PubSubCosmosClientImpl$observableForIdent$2(String str) {
        this.$ident = str;
    }

    public final v<? extends PubSub> apply(Throwable th) {
        StringBuilder V0 = je.V0("Error while receiving pubsub cosmos message for ident %s");
        V0.append(this.$ident);
        return s.P(new IllegalStateException(V0.toString(), th));
    }
}
