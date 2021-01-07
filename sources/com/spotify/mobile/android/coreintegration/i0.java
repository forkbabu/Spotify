package com.spotify.mobile.android.coreintegration;

import io.reactivex.y;

public final class i0 implements fjf<h0> {
    private final wlf<CoreIntegration> a;
    private final wlf<y> b;

    public i0(wlf<CoreIntegration> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a, this.b.get());
    }
}
