package com.spotify.music.spotlets.offline.util;

import com.google.protobuf.u;
import com.spotify.music.libs.viewuri.c;

public final class g implements fjf<OffliningLogger> {
    private final wlf<gl0<u>> a;
    private final wlf<c> b;

    public g(wlf<gl0<u>> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new OffliningLogger(this.a.get(), this.b.get());
    }
}
