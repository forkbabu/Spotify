package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.playlist.endpoints.g;

public final class h implements fjf<PlaylistEndpointCosmosService> {
    private final wlf<Cosmonaut> a;

    public h(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g.a aVar = g.a;
        return (PlaylistEndpointCosmosService) je.c0(this.a.get(), "cosmonaut", PlaylistEndpointCosmosService.class, "cosmonaut.createCosmosSe…osmosService::class.java)");
    }
}
