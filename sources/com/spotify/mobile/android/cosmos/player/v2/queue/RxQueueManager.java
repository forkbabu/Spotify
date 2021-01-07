package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.internal.SetQueueParameters;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

public class RxQueueManager implements QueueManager {
    private static final int TIMEOUT_5SECS = 5;
    private final PlayerV2Endpoint mPlayerV2Endpoint;

    public RxQueueManager(PlayerV2Endpoint playerV2Endpoint) {
        this.mPlayerV2Endpoint = playerV2Endpoint;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager
    public s<PlayerQueue> getQueue() {
        return this.mPlayerV2Endpoint.subscribeQueue();
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager
    public s<Response> setQueue(PlayerQueue playerQueue) {
        return setQueue(playerQueue, false);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager
    public s<Response> setQueue(PlayerQueue playerQueue, boolean z) {
        return this.mPlayerV2Endpoint.putQueueParams(new SetQueueParameters(playerQueue, z)).P().R0(5, TimeUnit.SECONDS);
    }
}
