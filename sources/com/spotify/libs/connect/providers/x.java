package com.spotify.libs.connect.providers;

public final class x implements fjf<RemoteActiveDeviceLoggingIdProviderImpl> {
    private final wlf<h> a;

    public x(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RemoteActiveDeviceLoggingIdProviderImpl(this.a.get());
    }
}
