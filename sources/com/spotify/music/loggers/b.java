package com.spotify.music.loggers;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

public final class b implements fjf<InteractionLogger> {
    private final wlf<jz1> a;
    private final wlf<c> b;
    private final wlf<a> c;
    private final wlf<cqe> d;

    public b(wlf<jz1> wlf, wlf<c> wlf2, wlf<a> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new InteractionLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
