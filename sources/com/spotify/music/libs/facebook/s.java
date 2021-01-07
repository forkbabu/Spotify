package com.spotify.music.libs.facebook;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

public final class s implements fjf<t> {
    private final wlf<Cosmonaut> a;

    public s(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    public static t a(Cosmonaut cosmonaut) {
        t tVar = (t) cosmonaut.createCosmosService(t.class);
        yif.g(tVar, "Cannot return null from a non-@Nullable @Provides method");
        return tVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
