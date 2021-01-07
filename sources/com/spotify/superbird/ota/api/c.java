package com.spotify.superbird.ota.api;

import com.spotify.http.u;

public final class c implements fjf<b> {
    private final wlf<u> a;

    public c(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
