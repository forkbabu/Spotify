package com.spotify.mobile.android.skiplimitpivot.view;

import android.content.res.Resources;

public final class c implements fjf<b> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<Resources> c;

    public c(wlf<b61> wlf, wlf<e61> wlf2, wlf<Resources> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get());
    }
}
