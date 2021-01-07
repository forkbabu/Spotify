package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;

public final class i implements fjf<h> {
    private final wlf<HubsGlueImageDelegate> a;
    private final wlf<HubsGlueComponent.a> b;
    private final wlf<HubsGlue2Row.a> c;
    private final wlf<HubsGlue2MiscComponents.a> d;

    public i(wlf<HubsGlueImageDelegate> wlf, wlf<HubsGlueComponent.a> wlf2, wlf<HubsGlue2Row.a> wlf3, wlf<HubsGlue2MiscComponents.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
