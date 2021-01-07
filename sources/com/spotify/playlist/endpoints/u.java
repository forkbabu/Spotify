package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.playlist.endpoints.t;

public final class u implements fjf<q> {
    private final wlf<Cosmonaut> a;

    public u(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t.a aVar = t.a;
        return (q) je.c0(this.a.get(), "cosmonaut", q.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
    }
}
