package com.spotify.music.preloadlogger;

import android.content.Context;

public final class d implements fjf<c> {
    private final wlf<Context> a;
    private final wlf<cqe> b;

    public d(wlf<Context> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
