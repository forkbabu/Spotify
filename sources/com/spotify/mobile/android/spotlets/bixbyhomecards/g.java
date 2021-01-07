package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.content.Context;

public final class g implements fjf<f> {
    private final wlf<Context> a;
    private final wlf<h2e> b;
    private final wlf<h> c;

    public g(wlf<Context> wlf, wlf<h2e> wlf2, wlf<h> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
