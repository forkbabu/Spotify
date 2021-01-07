package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class m1 implements fjf<vl3> {
    private final wlf<Cosmonaut> a;

    public m1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        vl3 vl3 = (vl3) this.a.get().createCosmosService(vl3.class);
        yif.g(vl3, "Cannot return null from a non-@Nullable @Provides method");
        return vl3;
    }
}
