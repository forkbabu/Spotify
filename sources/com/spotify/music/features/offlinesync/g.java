package com.spotify.music.features.offlinesync;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class g implements fjf<jv5> {
    private final wlf<Cosmonaut> a;

    public g(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        jv5 jv5 = (jv5) this.a.get().createCosmosService(jv5.class);
        yif.g(jv5, "Cannot return null from a non-@Nullable @Provides method");
        return jv5;
    }
}
