package com.spotify.music.features.ads;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class h1 implements fjf<ss3> {
    private final wlf<Cosmonaut> a;

    public h1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ss3 ss3 = (ss3) this.a.get().createCosmosService(ss3.class);
        yif.g(ss3, "Cannot return null from a non-@Nullable @Provides method");
        return ss3;
    }
}
