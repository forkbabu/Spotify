package com.spotify.zero.tracker.eventsender;

import com.google.protobuf.u;

public final class h implements fjf<g> {
    private final wlf<gl0<u>> a;
    private final wlf<a> b;

    public h(wlf<gl0<u>> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
