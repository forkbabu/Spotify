package com.spotify.effortlesslogin.prerequisites;

import com.spotify.effortlesslogin.backend.e;

public final class j implements fjf<i> {
    private final wlf<k> a;
    private final wlf<e> b;
    private final wlf<z1e> c;

    public j(wlf<k> wlf, wlf<e> wlf2, wlf<z1e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
