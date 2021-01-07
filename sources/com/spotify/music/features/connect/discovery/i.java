package com.spotify.music.features.connect.discovery;

import io.reactivex.s;

public final class i implements fjf<s<DiscoveredDeviceConnectionStatus>> {
    private final wlf<j> a;

    public i(wlf<j> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<DiscoveredDeviceConnectionStatus> b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
