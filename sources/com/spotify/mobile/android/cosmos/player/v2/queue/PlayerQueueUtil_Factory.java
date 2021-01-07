package com.spotify.mobile.android.cosmos.player.v2.queue;

public final class PlayerQueueUtil_Factory implements fjf<PlayerQueueUtil> {

    private static final class InstanceHolder {
        private static final PlayerQueueUtil_Factory INSTANCE = new PlayerQueueUtil_Factory();

        private InstanceHolder() {
        }
    }

    public static PlayerQueueUtil_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PlayerQueueUtil newInstance() {
        return new PlayerQueueUtil();
    }

    @Override // defpackage.wlf
    public PlayerQueueUtil get() {
        return newInstance();
    }
}
