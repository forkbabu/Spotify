package com.spotify.libs.connect.providers;

public final class s implements fjf<LocalDeviceProviderImpl> {
    private final wlf<m> a;

    public s(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new LocalDeviceProviderImpl(this.a.get());
    }
}
