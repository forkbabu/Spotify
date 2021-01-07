package com.spotify.podcast.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class m0 implements fjf<j0> {
    private final wlf<Cosmonaut> a;

    public m0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j0 j0Var = (j0) this.a.get().createCosmosService(j0.class);
        yif.g(j0Var, "Cannot return null from a non-@Nullable @Provides method");
        return j0Var;
    }
}
