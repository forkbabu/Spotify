package com.spotify.music.marquee;

import android.content.Context;

public final class p implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<fg0> b;

    public p(wlf<Context> wlf, wlf<fg0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get());
    }
}
