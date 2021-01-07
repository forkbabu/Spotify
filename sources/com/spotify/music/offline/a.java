package com.spotify.music.offline;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class a implements fjf<b> {
    private final wlf<Cosmonaut> a;

    public a(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    public static b a(Cosmonaut cosmonaut) {
        b bVar = (b) cosmonaut.createCosmosService(b.class);
        yif.g(bVar, "Cannot return null from a non-@Nullable @Provides method");
        return bVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
