package com.spotify.mobile.android.util;

import android.content.Context;

public final class p0 implements fjf<o0> {
    private final wlf<Context> a;

    public p0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o0(this.a.get());
    }
}
