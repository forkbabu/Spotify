package com.spotify.music.features.offlinesync;

import android.content.Context;

public final class i implements fjf<h> {
    private final wlf<Context> a;
    private final wlf<l2e> b;
    private final wlf<String> c;

    public i(wlf<Context> wlf, wlf<l2e> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
