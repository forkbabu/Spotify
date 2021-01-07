package com.spotify.libs.connect.providers;

public final class l implements fjf<ActiveDeviceProviderImpl> {
    private final wlf<m> a;

    public l(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ActiveDeviceProviderImpl(this.a.get());
    }
}
