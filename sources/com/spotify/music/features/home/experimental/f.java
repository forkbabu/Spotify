package com.spotify.music.features.home.experimental;

import com.spotify.music.loggers.ImpressionLogger;

public final class f implements fjf<e> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;
    private final wlf<rk9> c;

    public f(wlf<ImpressionLogger> wlf, wlf<l81> wlf2, wlf<rk9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
