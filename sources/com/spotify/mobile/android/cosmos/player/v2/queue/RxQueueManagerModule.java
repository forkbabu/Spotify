package com.spotify.mobile.android.cosmos.player.v2.queue;

public interface RxQueueManagerModule {

    public interface Bindings {
        QueueManager bindQueueManager(RxQueueManager rxQueueManager);
    }
}
