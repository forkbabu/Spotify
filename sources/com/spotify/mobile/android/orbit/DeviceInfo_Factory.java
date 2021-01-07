package com.spotify.mobile.android.orbit;

public final class DeviceInfo_Factory implements fjf<DeviceInfo> {

    /* access modifiers changed from: private */
    public static final class InstanceHolder {
        private static final DeviceInfo_Factory INSTANCE = new DeviceInfo_Factory();

        private InstanceHolder() {
        }
    }

    public static DeviceInfo_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeviceInfo newInstance() {
        return new DeviceInfo();
    }

    @Override // defpackage.wlf
    public DeviceInfo get() {
        return newInstance();
    }
}
