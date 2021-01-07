package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

public final class e0 implements fjf<d0> {
    private final wlf<HubsGlueImageDelegate> a;

    public e0(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get());
    }
}
