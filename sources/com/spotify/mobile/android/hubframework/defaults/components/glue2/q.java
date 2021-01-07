package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.p;
import com.spotify.mobile.android.util.ui.BadgesFactory;

public final class q implements fjf<p.a> {
    private final wlf<HubsGlueImageDelegate> a;
    private final wlf<BadgesFactory> b;

    public q(wlf<HubsGlueImageDelegate> wlf, wlf<BadgesFactory> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p.a(this.a.get(), this.b.get());
    }
}
