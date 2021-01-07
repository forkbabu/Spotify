package com.spotify.mobile.android.sso.bakery;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class b implements fjf<cv1> {
    private final wlf<Cosmonaut> a;

    public b(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cv1 cv1 = (cv1) this.a.get().createCosmosService(cv1.class);
        yif.g(cv1, "Cannot return null from a non-@Nullable @Provides method");
        return cv1;
    }
}
