package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class w0 implements fjf<rs3> {
    private final wlf<Cosmonaut> a;

    public w0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rs3 rs3 = (rs3) this.a.get().createCosmosService(rs3.class);
        yif.g(rs3, "Cannot return null from a non-@Nullable @Provides method");
        return rs3;
    }
}
