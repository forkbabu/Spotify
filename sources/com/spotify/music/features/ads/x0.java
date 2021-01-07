package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class x0 implements fjf<ml3> {
    private final wlf<Cosmonaut> a;

    public x0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ml3 ml3 = (ml3) this.a.get().createCosmosService(ml3.class);
        yif.g(ml3, "Cannot return null from a non-@Nullable @Provides method");
        return ml3;
    }
}
