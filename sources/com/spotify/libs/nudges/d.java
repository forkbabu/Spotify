package com.spotify.libs.nudges;

import android.content.Context;

public final class d implements fjf<c> {
    private final wlf<l> a;
    private final wlf<Context> b;

    public d(wlf<l> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
