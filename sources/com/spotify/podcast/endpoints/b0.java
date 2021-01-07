package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class b0 implements fjf<y> {
    private final wlf<Cosmonaut> a;

    public b0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y yVar = (y) this.a.get().createCosmosService(y.class);
        yif.g(yVar, "Cannot return null from a non-@Nullable @Provides method");
        return yVar;
    }
}
