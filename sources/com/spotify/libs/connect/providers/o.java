package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.j;

public final class o implements fjf<DevicesListProviderImpl> {
    private final wlf<j> a;

    public o(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DevicesListProviderImpl(this.a.get());
    }
}
