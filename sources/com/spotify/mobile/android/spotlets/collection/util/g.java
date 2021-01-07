package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class g implements fjf<f> {
    private final wlf<Cosmonaut> a;

    public g(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f fVar = (f) this.a.get().createCosmosService(f.class);
        yif.g(fVar, "Cannot return null from a non-@Nullable @Provides method");
        return fVar;
    }
}
