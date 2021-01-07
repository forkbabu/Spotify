package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

public final class o implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public o(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get());
    }
}
