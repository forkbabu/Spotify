package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.playlist.endpoints.m;

public final class n implements fjf<j> {
    private final wlf<Cosmonaut> a;

    public n(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m.a aVar = m.a;
        return (j) je.c0(this.a.get(), "cosmonaut", j.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
    }
}
