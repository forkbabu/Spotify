package com.spotify.music.libs.carmodeengine.util;

import android.app.Application;

public final class i0 implements fjf<h0> {
    private final wlf<Application> a;
    private final wlf<w52> b;

    public i0(wlf<Application> wlf, wlf<w52> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get());
    }
}
