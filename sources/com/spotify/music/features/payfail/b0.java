package com.spotify.music.features.payfail;

import com.google.protobuf.u;

public final class b0 implements fjf<a0> {
    private final wlf<gl0<u>> a;

    public b0(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get());
    }
}
