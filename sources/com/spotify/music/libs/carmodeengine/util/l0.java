package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.s;

public final class l0 implements fjf<k0> {
    private final wlf<s<d7a>> a;
    private final wlf<c6a> b;

    public l0(wlf<s<d7a>> wlf, wlf<c6a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get(), this.b.get());
    }
}
