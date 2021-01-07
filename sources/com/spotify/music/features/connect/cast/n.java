package com.spotify.music.features.connect.cast;

import com.google.protobuf.u;

public final class n implements fjf<m> {
    private final wlf<gl0<u>> a;

    public n(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get());
    }
}
