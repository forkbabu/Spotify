package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;

public final class f0 implements fjf<e0> {
    private final wlf<Context> a;
    private final wlf<b42> b;

    public f0(wlf<Context> wlf, wlf<b42> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0(this.a.get(), this.b.get());
    }
}
