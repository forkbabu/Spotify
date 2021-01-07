package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class c1 implements fjf<rl3> {
    private final wlf<Cosmonaut> a;

    public c1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rl3 rl3 = (rl3) this.a.get().createCosmosService(rl3.class);
        yif.g(rl3, "Cannot return null from a non-@Nullable @Provides method");
        return rl3;
    }
}
