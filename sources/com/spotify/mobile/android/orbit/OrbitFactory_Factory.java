package com.spotify.mobile.android.orbit;

import com.spotify.http.clienttoken.c;
import com.spotify.libs.connect.r;
import com.spotify.mobile.android.util.v;

public final class OrbitFactory_Factory implements fjf<OrbitFactory> {
    private final wlf<c> clientTokenPersistentStorageProvider;
    private final wlf<com.spotify.http.contentaccesstoken.c> contentAccessRefreshTokenPersistentStorageProvider;
    private final wlf<v> deviceIdProvider;
    private final wlf<DeviceInfo> deviceInfoProvider;
    private final wlf<r> deviceTypeResolverProvider;
    private final wlf<OrbitLibraryLoader> orbitLibraryLoaderProvider;

    public OrbitFactory_Factory(wlf<OrbitLibraryLoader> wlf, wlf<DeviceInfo> wlf2, wlf<v> wlf3, wlf<r> wlf4, wlf<c> wlf5, wlf<com.spotify.http.contentaccesstoken.c> wlf6) {
        this.orbitLibraryLoaderProvider = wlf;
        this.deviceInfoProvider = wlf2;
        this.deviceIdProvider = wlf3;
        this.deviceTypeResolverProvider = wlf4;
        this.clientTokenPersistentStorageProvider = wlf5;
        this.contentAccessRefreshTokenPersistentStorageProvider = wlf6;
    }

    public static OrbitFactory_Factory create(wlf<OrbitLibraryLoader> wlf, wlf<DeviceInfo> wlf2, wlf<v> wlf3, wlf<r> wlf4, wlf<c> wlf5, wlf<com.spotify.http.contentaccesstoken.c> wlf6) {
        return new OrbitFactory_Factory(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    public static OrbitFactory newInstance(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, v vVar, r rVar, c cVar, com.spotify.http.contentaccesstoken.c cVar2) {
        return new OrbitFactory(orbitLibraryLoader, deviceInfo, vVar, rVar, cVar, cVar2);
    }

    @Override // defpackage.wlf
    public OrbitFactory get() {
        return newInstance(this.orbitLibraryLoaderProvider.get(), this.deviceInfoProvider.get(), this.deviceIdProvider.get(), this.deviceTypeResolverProvider.get(), this.clientTokenPersistentStorageProvider.get(), this.contentAccessRefreshTokenPersistentStorageProvider.get());
    }
}
