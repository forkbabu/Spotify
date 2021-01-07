package com.spotify.music.features.settings;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class c1 implements fjf<nk8> {
    private final wlf<Cosmonaut> a;

    public c1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        nk8 nk8 = (nk8) this.a.get().createCosmosService(nk8.class);
        yif.g(nk8, "Cannot return null from a non-@Nullable @Provides method");
        return nk8;
    }
}
