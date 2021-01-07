package com.spotify.music.features.offlinesync;

import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<jv5> a;
    private final wlf<y> b;

    public f(wlf<jv5> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
