package com.spotify.mobile.android.spotlets.uitooling;

import com.spotify.mobile.android.util.o0;

public final class b implements fjf<a> {
    private final wlf<o0> a;

    public b(wlf<o0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.a.get();
        return new a();
    }
}
