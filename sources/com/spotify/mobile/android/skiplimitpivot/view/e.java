package com.spotify.mobile.android.skiplimitpivot.view;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;

public final class e implements fjf<d> {
    private final wlf<Context> a;
    private final wlf<m> b;
    private final wlf<c> c;

    public e(wlf<Context> wlf, wlf<m> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
