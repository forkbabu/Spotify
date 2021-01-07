package com.spotify.playlist.endpoints;

import com.spotify.playlist.endpoints.exceptions.a;
import com.spotify.remoteconfig.l9;

public final class f implements fjf<e> {
    private final wlf<cqe> a;
    private final wlf<PlaylistEndpointCosmosService> b;
    private final wlf<a> c;
    private final wlf<l9> d;

    public f(wlf<cqe> wlf, wlf<PlaylistEndpointCosmosService> wlf2, wlf<a> wlf3, wlf<l9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
