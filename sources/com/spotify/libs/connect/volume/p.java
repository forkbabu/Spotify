package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class p implements fjf<f> {
    private final wlf<Cosmonaut> a;

    public p(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f fVar = (f) this.a.get().createCosmosService(f.class);
        yif.g(fVar, "Cannot return null from a non-@Nullable @Provides method");
        return fVar;
    }
}
