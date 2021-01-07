package com.spotify.music.connection;

import com.spotify.mobile.android.util.connectivity.v;

public final class j implements fjf<n> {
    private final wlf<v> a;

    public j(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return n.a(this.a.get());
    }
}
