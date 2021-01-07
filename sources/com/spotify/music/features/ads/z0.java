package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class z0 implements fjf<ol3> {
    private final wlf<Cosmonaut> a;

    public z0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ol3 ol3 = (ol3) this.a.get().createCosmosService(ol3.class);
        yif.g(ol3, "Cannot return null from a non-@Nullable @Provides method");
        return ol3;
    }
}
