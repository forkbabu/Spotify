package com.spotify.music.navigation;

import android.content.Context;

public final class p implements fjf<o> {
    private final wlf<Context> a;
    private final wlf<String> b;

    public p(wlf<Context> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get());
    }
}
