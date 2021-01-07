package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class g1 implements fjf<ul3> {
    private final wlf<Cosmonaut> a;

    public g1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ul3 ul3 = (ul3) this.a.get().createCosmosService(ul3.class);
        yif.g(ul3, "Cannot return null from a non-@Nullable @Provides method");
        return ul3;
    }
}
