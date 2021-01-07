package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class w implements fjf<v> {
    private final wlf<Cosmonaut> a;

    public w(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = (v) this.a.get().createCosmosService(v.class);
        yif.g(vVar, "Cannot return null from a non-@Nullable @Provides method");
        return vVar;
    }
}
