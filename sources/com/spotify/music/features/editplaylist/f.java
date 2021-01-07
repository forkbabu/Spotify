package com.spotify.music.features.editplaylist;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class f implements fjf<EditPlaylistLogger> {
    private final wlf<InteractionLogger> a;
    private final wlf<ImpressionLogger> b;
    private final wlf<a> c;
    private final wlf<tx4> d;
    private final wlf<ere> e;

    public f(wlf<InteractionLogger> wlf, wlf<ImpressionLogger> wlf2, wlf<a> wlf3, wlf<tx4> wlf4, wlf<ere> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EditPlaylistLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
