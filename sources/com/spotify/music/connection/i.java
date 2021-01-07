package com.spotify.music.connection;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class i implements fjf<k> {
    private final wlf<Cosmonaut> a;

    public i(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k kVar = (k) this.a.get().createCosmosService(k.class);
        yif.g(kVar, "Cannot return null from a non-@Nullable @Provides method");
        return kVar;
    }
}
