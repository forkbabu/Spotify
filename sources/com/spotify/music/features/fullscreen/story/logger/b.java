package com.spotify.music.features.fullscreen.story.logger;

import com.google.protobuf.u;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.e1;

public final class b implements fjf<a> {
    private final wlf<ere> a;
    private final wlf<e1> b;
    private final wlf<InteractionLogger> c;
    private final wlf<ImpressionLogger> d;
    private final wlf<gl0<u>> e;
    private final wlf<String> f;

    public b(wlf<ere> wlf, wlf<e1> wlf2, wlf<InteractionLogger> wlf3, wlf<ImpressionLogger> wlf4, wlf<gl0<u>> wlf5, wlf<String> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
