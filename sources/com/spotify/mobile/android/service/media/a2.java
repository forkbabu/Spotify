package com.spotify.mobile.android.service.media;

import android.content.Context;

public final class a2 implements fjf<z1> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<fg0> c;
    private final wlf<y2> d;

    public a2(wlf<Context> wlf, wlf<String> wlf2, wlf<fg0> wlf3, wlf<y2> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
