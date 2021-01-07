package com.spotify.music.features.settings;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class b1 implements fjf<mk8> {
    private final wlf<Cosmonaut> a;

    public b1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        mk8 mk8 = (mk8) this.a.get().createCosmosService(mk8.class);
        yif.g(mk8, "Cannot return null from a non-@Nullable @Provides method");
        return mk8;
    }
}
