package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import io.reactivex.s;

@Deprecated
public interface QueueManager {
    s<PlayerQueue> getQueue();

    s<Response> setQueue(PlayerQueue playerQueue);

    s<Response> setQueue(PlayerQueue playerQueue, boolean z);
}
