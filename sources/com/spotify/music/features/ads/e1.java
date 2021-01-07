package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class e1 implements fjf<sl3> {
    private final wlf<Cosmonaut> a;

    public e1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sl3 sl3 = (sl3) this.a.get().createCosmosService(sl3.class);
        yif.g(sl3, "Cannot return null from a non-@Nullable @Provides method");
        return sl3;
    }
}
