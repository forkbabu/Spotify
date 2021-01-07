package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class f1 implements fjf<tl3> {
    private final wlf<Cosmonaut> a;

    public f1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        tl3 tl3 = (tl3) this.a.get().createCosmosService(tl3.class);
        yif.g(tl3, "Cannot return null from a non-@Nullable @Provides method");
        return tl3;
    }
}
