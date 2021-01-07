package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;

public final class c0 implements fjf<b0> {
    private final wlf<Context> a;
    private final wlf<l22> b;

    public c0(wlf<Context> wlf, wlf<l22> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get(), this.b.get());
    }
}
