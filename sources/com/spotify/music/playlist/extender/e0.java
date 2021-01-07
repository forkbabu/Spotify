package com.spotify.music.playlist.extender;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;

public final class e0 implements fjf<ExtenderLogger> {
    private final wlf<ere> a;
    private final wlf<c> b;
    private final wlf<InteractionLogger> c;
    private final wlf<a> d;

    public e0(wlf<ere> wlf, wlf<c> wlf2, wlf<InteractionLogger> wlf3, wlf<a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ExtenderLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
