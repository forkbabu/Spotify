package com.spotify.mobile.android.sso;

import android.app.Activity;
import com.spotify.mobile.android.sso.protocol.n;
import com.spotify.mobile.android.util.connectivity.c0;

public final class j implements fjf<i> {
    private final wlf<n> a;
    private final wlf<m> b;
    private final wlf<c0> c;
    private final wlf<Activity> d;

    public j(wlf<n> wlf, wlf<m> wlf2, wlf<c0> wlf3, wlf<Activity> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
