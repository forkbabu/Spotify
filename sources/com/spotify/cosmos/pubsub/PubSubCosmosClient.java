package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.pubsub.model.PubSub;
import io.reactivex.s;

public interface PubSubCosmosClient {
    s<PubSub> observableForIdent(String str);
}
