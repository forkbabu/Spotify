package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class d1 implements fjf<al3> {
    private final wlf<Cosmonaut> a;

    public d1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        al3 al3 = (al3) this.a.get().createCosmosService(al3.class);
        yif.g(al3, "Cannot return null from a non-@Nullable @Provides method");
        return al3;
    }
}
