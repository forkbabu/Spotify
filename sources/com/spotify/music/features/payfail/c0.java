package com.spotify.music.features.payfail;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class c0 implements fjf<g0> {
    private final wlf<Cosmonaut> a;

    public c0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g0 g0Var = (g0) this.a.get().createCosmosService(g0.class);
        yif.g(g0Var, "Cannot return null from a non-@Nullable @Provides method");
        return g0Var;
    }
}
