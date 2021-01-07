package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class a1 implements fjf<pl3> {
    private final wlf<Cosmonaut> a;

    public a1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        pl3 pl3 = (pl3) this.a.get().createCosmosService(pl3.class);
        yif.g(pl3, "Cannot return null from a non-@Nullable @Provides method");
        return pl3;
    }
}
