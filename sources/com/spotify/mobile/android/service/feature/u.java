package com.spotify.mobile.android.service.feature;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.rxjava2.n;
import com.spotify.rxjava2.s;

public final class u implements fjf<t> {
    private final wlf<Context> a;
    private final wlf<FlagsManager> b;
    private final wlf<q> c;
    private final wlf<n> d;
    private final wlf<s<c>> e;

    public u(wlf<Context> wlf, wlf<FlagsManager> wlf2, wlf<q> wlf3, wlf<n> wlf4, wlf<s<c>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
