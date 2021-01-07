package com.spotify.music.features.album.di;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class l0 implements fjf<rz3> {
    private final wlf<Cosmonaut> a;

    public l0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rz3 rz3 = (rz3) this.a.get().createCosmosService(rz3.class);
        yif.g(rz3, "Cannot return null from a non-@Nullable @Provides method");
        return rz3;
    }
}
