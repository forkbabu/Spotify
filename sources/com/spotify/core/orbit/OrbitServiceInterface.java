package com.spotify.core.orbit;

import com.spotify.core.image.ImageLoaderInterface;

public interface OrbitServiceInterface {
    public static final int LIFECYCLE_STATE_STARTED = 1;
    public static final int LIFECYCLE_STATE_STARTING = 0;
    public static final int LIFECYCLE_STATE_STOPPED = 3;
    public static final int LIFECYCLE_STATE_STOPPING = 2;
    public static final int LIFECYCLE_STATE_UNINITIATED = -1;

    void crash();

    void destroy();

    ImageLoaderInterface getImageLoader();

    int getLifecycleState();

    OrbitSessionInterface getOrbitSession();

    boolean isCreated();

    void setConnectivityType(int i, boolean z);

    void setObserver(OrbitServiceObserver orbitServiceObserver);

    void start(String str, String str2, String str3, boolean z, boolean z2, Object obj);

    void stop();

    void tryReconnectNow(boolean z);
}
