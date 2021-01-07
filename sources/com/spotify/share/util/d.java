package com.spotify.share.util;

import android.content.Context;
import com.spotify.mobile.android.util.t;
import com.spotify.share.util.c;

public final class d implements fjf<c> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<c.b> c;
    private final wlf<t> d;

    public d(wlf<Context> wlf, wlf<c.a> wlf2, wlf<c.b> wlf3, wlf<t> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
