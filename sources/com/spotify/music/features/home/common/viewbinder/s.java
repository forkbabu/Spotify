package com.spotify.music.features.home.common.viewbinder;

import com.spotify.music.loggers.ImpressionLogger;

public final class s implements fjf<r> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;

    public s(wlf<ImpressionLogger> wlf, wlf<l81> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
