package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class r implements fjf<k> {
    private final wlf<Cosmonaut> a;

    public r(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k kVar = (k) this.a.get().createCosmosService(k.class);
        yif.g(kVar, "Cannot return null from a non-@Nullable @Provides method");
        return kVar;
    }
}
