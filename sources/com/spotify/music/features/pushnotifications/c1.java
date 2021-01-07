package com.spotify.music.features.pushnotifications;

import com.spotify.mobile.android.util.t;

public final class c1 implements fjf<b1> {
    private final wlf<a1> a;
    private final wlf<t> b;

    public c1(wlf<a1> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b1(this.a.get(), this.b.get());
    }
}
