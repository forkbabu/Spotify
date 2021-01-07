package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;

public final class q implements fjf<n.b> {
    private final wlf<HubsGlueImageDelegate> a;

    public q(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n.b(this.a.get());
    }
}
