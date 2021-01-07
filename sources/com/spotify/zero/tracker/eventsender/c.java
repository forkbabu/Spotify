package com.spotify.zero.tracker.eventsender;

import com.spotify.music.spotlets.tracker.identifier.a;

public final class c implements fjf<b> {
    private final wlf<f> a;
    private final wlf<a> b;
    private final wlf<kx0> c;

    public c(wlf<f> wlf, wlf<a> wlf2, wlf<kx0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get());
    }
}
