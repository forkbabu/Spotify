package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class b1 implements fjf<ql3> {
    private final wlf<Cosmonaut> a;

    public b1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ql3 ql3 = (ql3) this.a.get().createCosmosService(ql3.class);
        yif.g(ql3, "Cannot return null from a non-@Nullable @Provides method");
        return ql3;
    }
}
