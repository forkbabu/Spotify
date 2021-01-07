package com.spotify.music.libs.assistedcuration;

import com.spotify.ubi.specification.factories.t;

public final class d implements fjf<c> {
    private final wlf<f> a;
    private final wlf<h> b;
    private final wlf<t> c;
    private final wlf<ere> d;

    public d(wlf<f> wlf, wlf<h> wlf2, wlf<t> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a, this.b, this.c, this.d);
    }
}
