package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

public final class m implements fjf<l> {
    private final wlf<HubsGlueImageDelegate> a;

    public m(wlf<HubsGlueImageDelegate> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
