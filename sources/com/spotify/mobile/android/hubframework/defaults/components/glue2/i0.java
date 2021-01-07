package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

public final class i0 implements fjf<h0> {
    private final wlf<HubsGlueImageDelegate> a;

    public i0(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get());
    }
}
