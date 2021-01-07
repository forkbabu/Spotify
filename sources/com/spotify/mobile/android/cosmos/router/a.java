package com.spotify.mobile.android.cosmos.router;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.mobile.android.cosmos.router.CosmosRequestQueue;

public final /* synthetic */ class a implements Lifetime {
    public final /* synthetic */ CosmosRequestQueue a;
    public final /* synthetic */ CosmosRequestQueue.QueuedRequest b;

    public /* synthetic */ a(CosmosRequestQueue cosmosRequestQueue, CosmosRequestQueue.QueuedRequest queuedRequest) {
        this.a = cosmosRequestQueue;
        this.b = queuedRequest;
    }

    @Override // com.spotify.cosmos.router.Lifetime
    public final void destroy() {
        CosmosRequestQueue cosmosRequestQueue = this.a;
        cosmosRequestQueue.mQueuedRequests.remove(this.b);
    }
}
