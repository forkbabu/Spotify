package com.spotify.music.libs.facebook;

import com.spotify.mobile.android.util.o0;

public final class v implements fjf<u> {
    private final wlf<t> a;
    private final wlf<o0> b;

    public v(wlf<t> wlf, wlf<o0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get());
    }
}
