package com.spotify.share.util;

import android.app.Application;

public final class j implements fjf<i> {
    private final wlf<Application> a;

    public j(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
