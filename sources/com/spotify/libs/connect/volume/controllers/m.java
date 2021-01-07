package com.spotify.libs.connect.volume.controllers;

import com.spotify.libs.connect.j;

public final class m implements fjf<l> {
    private final wlf<j> a;
    private final wlf<p> b;
    private final wlf<p> c;

    public m(wlf<j> wlf, wlf<p> wlf2, wlf<p> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get());
    }
}
