package com.spotify.music.features.album.di;

import com.spotify.music.loggers.ImpressionLogger;

public final class f0 implements fjf<tk9> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;
    private final wlf<rk9> c;

    public f0(wlf<ImpressionLogger> wlf, wlf<l81> wlf2, wlf<rk9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tk9(this.a.get(), this.b.get(), this.c.get());
    }
}
