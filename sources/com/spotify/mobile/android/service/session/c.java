package com.spotify.mobile.android.service.session;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class c implements fjf<d> {
    private final wlf<Cosmonaut> a;

    public c(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = (d) this.a.get().createCosmosService(d.class);
        yif.g(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
