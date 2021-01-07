package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class q implements fjf<j> {
    private final wlf<Cosmonaut> a;

    public q(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j jVar = (j) this.a.get().createCosmosService(j.class);
        yif.g(jVar, "Cannot return null from a non-@Nullable @Provides method");
        return jVar;
    }
}
