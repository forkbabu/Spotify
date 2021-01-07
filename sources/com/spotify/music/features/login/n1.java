package com.spotify.music.features.login;

import com.spotify.music.z0;

public final class n1 implements fjf<m1> {
    private final wlf<z0> a;
    private final wlf<String> b;

    public n1(wlf<z0> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m1(this.a.get(), this.b.get());
    }
}
