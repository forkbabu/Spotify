package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.remoteconfig.l8;

public final class q implements fjf<Boolean> {
    private final wlf<l8> a;

    public q(wlf<l8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
