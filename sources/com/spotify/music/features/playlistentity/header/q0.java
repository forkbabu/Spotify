package com.spotify.music.features.playlistentity.header;

import com.spotify.music.loggers.InteractionLogger;

public final class q0 implements fjf<p0> {
    private final wlf<InteractionLogger> a;
    private final wlf<yj6> b;
    private final wlf<ere> c;

    public q0(wlf<InteractionLogger> wlf, wlf<yj6> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p0(this.a.get(), this.b.get(), this.c.get());
    }
}
