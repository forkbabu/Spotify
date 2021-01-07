package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;

public final class s implements fjf<n.d> {
    private final wlf<HubsGlueImageDelegate> a;

    public s(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n.d(this.a.get());
    }
}
