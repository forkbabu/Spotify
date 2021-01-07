package com.spotify.cosmos.pubsub;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.pubsub.model.PubSubResponse;
import io.reactivex.s;

@CosmosService
public interface PubSubEndpoint {
    @SUB("sp://server-push/pushed-messages")
    s<PubSubResponse> notifications(@Query("ident") String str);
}
