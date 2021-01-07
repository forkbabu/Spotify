package com.spotify.mobile.android.rx;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class q implements fjf<u> {
    private final wlf<Cosmonaut> a;

    public q(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u uVar = (u) this.a.get().createCosmosService(u.class);
        yif.g(uVar, "Cannot return null from a non-@Nullable @Provides method");
        return uVar;
    }
}
