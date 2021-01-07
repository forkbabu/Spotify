package com.spotify.music.features.settings;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class e1 implements fjf<ok8> {
    private final wlf<Cosmonaut> a;

    public e1(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ok8 ok8 = (ok8) this.a.get().createCosmosService(ok8.class);
        yif.g(ok8, "Cannot return null from a non-@Nullable @Provides method");
        return ok8;
    }
}
