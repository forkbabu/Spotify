package com.spotify.mobile.android.util.connectivity;

import android.content.Context;

public final class d0 implements fjf<c0> {
    private final wlf<Context> a;

    public d0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get());
    }
}
