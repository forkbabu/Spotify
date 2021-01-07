package com.spotify.music.libs.mediasession;

import android.content.Context;

public final class p0 implements fjf<o0> {
    private final wlf<Context> a;
    private final wlf<pea> b;

    public p0(wlf<Context> wlf, wlf<pea> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o0(this.a.get(), this.b.get());
    }
}
