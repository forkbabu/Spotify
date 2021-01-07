package com.spotify.music.libs.web;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class i implements fjf<h> {
    private final wlf<Cosmonaut> a;

    public i(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        h hVar = (h) this.a.get().createCosmosService(h.class);
        yif.g(hVar, "Cannot return null from a non-@Nullable @Provides method");
        return hVar;
    }
}
