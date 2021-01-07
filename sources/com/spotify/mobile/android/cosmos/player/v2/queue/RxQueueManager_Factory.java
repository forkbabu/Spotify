package com.spotify.mobile.android.cosmos.player.v2.queue;

public final class RxQueueManager_Factory implements fjf<RxQueueManager> {
    private final wlf<PlayerV2Endpoint> playerV2EndpointProvider;

    public RxQueueManager_Factory(wlf<PlayerV2Endpoint> wlf) {
        this.playerV2EndpointProvider = wlf;
    }

    public static RxQueueManager_Factory create(wlf<PlayerV2Endpoint> wlf) {
        return new RxQueueManager_Factory(wlf);
    }

    public static RxQueueManager newInstance(PlayerV2Endpoint playerV2Endpoint) {
        return new RxQueueManager(playerV2Endpoint);
    }

    @Override // defpackage.wlf
    public RxQueueManager get() {
        return newInstance(this.playerV2EndpointProvider.get());
    }
}
