package com.spotify.music.features.createplaylist.logger;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.InteractionLogger;

public final class b implements fjf<CreatePlaylistLoggerImpl> {
    private final wlf<ere> a;
    private final wlf<InteractionLogger> b;
    private final wlf<a> c;

    public b(wlf<ere> wlf, wlf<InteractionLogger> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new CreatePlaylistLoggerImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
