package com.spotify.music.features.connect.cast;

import io.reactivex.y;

public final class u implements fjf<t> {
    private final wlf<n6> a;
    private final wlf<String> b;
    private final wlf<y> c;

    public u(wlf<n6> wlf, wlf<String> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get());
    }
}
