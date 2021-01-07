package com.spotify.mobile.android.service.feature;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

public final class j implements fjf<i> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public j(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get());
    }
}
