package com.spotify.music.features.ads.video;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class r implements fjf<s> {
    private final wlf<Cosmonaut> a;

    public r(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s sVar = (s) this.a.get().createCosmosService(s.class);
        yif.g(sVar, "Cannot return null from a non-@Nullable @Provides method");
        return sVar;
    }
}
