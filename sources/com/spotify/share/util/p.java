package com.spotify.share.util;

import android.app.Application;

public final class p implements fjf<o> {
    private final wlf<Application> a;

    public p(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get());
    }
}
