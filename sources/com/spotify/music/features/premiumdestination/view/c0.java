package com.spotify.music.features.premiumdestination.view;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

public final class c0 implements fjf<b0> {
    private final wlf<HubsGlueImageDelegate> a;
    private final wlf<h> b;

    public c0(wlf<HubsGlueImageDelegate> wlf, wlf<h> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get(), this.b.get());
    }
}
