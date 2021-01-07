package com.spotify.core.orbit;

import com.spotify.core.image.ImageLoader;

public final class OrbitService implements OrbitServiceInterface {
    private long nOrbitServicePtr;

    interface DeviceType {
        public static final int SMARTPHONE = 3;
        public static final int TABLET = 2;
    }

    private OrbitService() {
    }

    public static native OrbitService create(Object obj, Object obj2, Object obj3);

    public static native void setClassLoader(ClassLoader classLoader);

    public static native void setMobileDeviceInfo(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3);

    public static void setMobileDeviceInfo(String str, int i, String str2, String str3, String str4, String str5, boolean z, int i2) {
        setMobileDeviceInfo(str, i, str2, str3, str4, str5, z ? 2 : 3, i2);
    }

    public static native void setMobileDeviceInfoV2(Object obj);

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void crash();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void destroy();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native ImageLoader getImageLoader();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native int getLifecycleState();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native OrbitSession getOrbitSession();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public boolean isCreated() {
        return this.nOrbitServicePtr != 0;
    }

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void setConnectivityType(int i, boolean z);

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void setObserver(OrbitServiceObserver orbitServiceObserver);

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void start(String str, String str2, String str3, boolean z, boolean z2, Object obj);

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void stop();

    @Override // com.spotify.core.orbit.OrbitServiceInterface
    public native void tryReconnectNow(boolean z);
}
