package com.spotify.mobile.android.service.feature;

import com.spotify.remoteconfig.nj;

public final class r implements fjf<q> {
    private final wlf<nj> a;

    public r(wlf<nj> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get());
    }
}
