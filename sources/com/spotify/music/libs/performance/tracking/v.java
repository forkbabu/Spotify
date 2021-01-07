package com.spotify.music.libs.performance.tracking;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class v implements fjf<o> {
    private final wlf<Cosmonaut> a;

    public v(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o oVar = (o) this.a.get().createCosmosService(o.class);
        yif.g(oVar, "Cannot return null from a non-@Nullable @Provides method");
        return oVar;
    }
}
