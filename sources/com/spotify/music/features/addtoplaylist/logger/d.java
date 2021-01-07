package com.spotify.music.features.addtoplaylist.logger;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class d implements fjf<AddToPlaylistLoggerImpl> {
    private final wlf<InteractionLogger> a;
    private final wlf<ImpressionLogger> b;
    private final wlf<ere> c;
    private final wlf<a> d;

    public d(wlf<InteractionLogger> wlf, wlf<ImpressionLogger> wlf2, wlf<ere> wlf3, wlf<a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AddToPlaylistLoggerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
