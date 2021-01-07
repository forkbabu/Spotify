package com.spotify.mobile.android.util.prefs;

import android.app.Application;

public final class k implements fjf<SpSharedPreferences<Object>> {
    private final wlf<Application> a;
    private final wlf<i> b;

    public k(wlf<Application> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().a(this.a.get());
    }
}
