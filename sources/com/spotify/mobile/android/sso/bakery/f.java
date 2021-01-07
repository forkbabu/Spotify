package com.spotify.mobile.android.sso.bakery;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<cv1> a;
    private final wlf<ObjectMapper> b;
    private final wlf<y> c;

    public f(wlf<cv1> wlf, wlf<ObjectMapper> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
