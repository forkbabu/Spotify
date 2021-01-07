package com.spotify.effortlesslogin;

import com.spotify.effortlesslogin.backend.e;
import io.reactivex.y;

public final class r implements fjf<p> {
    private final wlf<s> a;
    private final wlf<e> b;
    private final wlf<z1e> c;
    private final wlf<y> d;
    private final wlf<y> e;

    public r(wlf<s> wlf, wlf<e> wlf2, wlf<z1e> wlf3, wlf<y> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
