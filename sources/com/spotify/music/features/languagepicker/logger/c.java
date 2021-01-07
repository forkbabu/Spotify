package com.spotify.music.features.languagepicker.logger;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class c implements fjf<b> {
    private final wlf<ImpressionLogger> a;
    private final wlf<InteractionLogger> b;

    public c(wlf<ImpressionLogger> wlf, wlf<InteractionLogger> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
