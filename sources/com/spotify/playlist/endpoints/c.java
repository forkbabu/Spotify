package com.spotify.playlist.endpoints;

import com.google.protobuf.u;

public final class c implements fjf<b> {
    private final wlf<gl0<u>> a;

    public c(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
