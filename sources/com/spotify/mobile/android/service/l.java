package com.spotify.mobile.android.service;

import android.os.Handler;

public final class l implements fjf<k> {
    private final wlf<Handler> a;
    private final wlf<rn1> b;

    public l(wlf<Handler> wlf, wlf<rn1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
