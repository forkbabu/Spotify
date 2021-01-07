package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;

public final class r implements fjf<n.c> {
    private final wlf<HubsGlueImageDelegate> a;

    public r(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n.c(this.a.get());
    }
}
