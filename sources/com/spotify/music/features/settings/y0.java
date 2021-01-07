package com.spotify.music.features.settings;

import com.spotify.android.flags.c;

public final class y0 implements fjf<x0> {
    private final wlf<c> a;
    private final wlf<cqe> b;
    private final wlf<jz1> c;

    public y0(wlf<c> wlf, wlf<cqe> wlf2, wlf<jz1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x0(this.a.get(), this.b.get(), this.c.get());
    }
}
