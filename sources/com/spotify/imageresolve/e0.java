package com.spotify.imageresolve;

import android.content.Context;

public final class e0 implements fjf<b0> {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<Integer> c;

    public e0(wlf<Context> wlf, wlf<cqe> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
