package com.spotify.music.features.connect.cast;

import android.content.Context;

public final class p implements fjf<o> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<r> c;
    private final wlf<t> d;

    public p(wlf<Context> wlf, wlf<String> wlf2, wlf<r> wlf3, wlf<t> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
