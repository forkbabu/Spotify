package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.s;

public final class x implements fjf<s<Boolean>> {
    private final wlf<g0> a;
    private final wlf<Boolean> b;

    public x(wlf<g0> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a().j0(new c(this.b)).E().v0(1).h1();
    }
}
