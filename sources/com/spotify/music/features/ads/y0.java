package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class y0 implements fjf<nl3> {
    private final wlf<Cosmonaut> a;

    public y0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        nl3 nl3 = (nl3) this.a.get().createCosmosService(nl3.class);
        yif.g(nl3, "Cannot return null from a non-@Nullable @Provides method");
        return nl3;
    }
}
