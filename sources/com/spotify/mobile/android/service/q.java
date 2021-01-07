package com.spotify.mobile.android.service;

import com.spotify.music.z0;

public final class q implements fjf<p> {
    private final wlf<z0> a;
    private final wlf<String> b;
    private final wlf<String> c;

    public q(wlf<z0> wlf, wlf<String> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get());
    }
}
