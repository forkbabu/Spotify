package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class i1 implements fjf<MusicPagesLogger> {
    private final wlf<p69> a;
    private final wlf<xc9> b;
    private final wlf<zc9> c;
    private final wlf<InteractionLogger> d;
    private final wlf<ImpressionLogger> e;

    public i1(wlf<p69> wlf, wlf<xc9> wlf2, wlf<zc9> wlf3, wlf<InteractionLogger> wlf4, wlf<ImpressionLogger> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MusicPagesLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
