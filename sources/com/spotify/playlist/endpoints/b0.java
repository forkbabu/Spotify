package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.playlist.endpoints.a0;

public final class b0 implements fjf<w> {
    private final wlf<Cosmonaut> a;

    public b0(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a0.a aVar = a0.a;
        return (w) je.c0(this.a.get(), "cosmonaut", w.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
    }
}
