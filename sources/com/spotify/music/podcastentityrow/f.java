package com.spotify.music.podcastentityrow;

import com.spotify.music.features.addtoplaylist.d;

public final class f implements fjf<e> {
    private final wlf<ih0> a;
    private final wlf<d> b;
    private final wlf<rbb> c;

    public f(wlf<ih0> wlf, wlf<d> wlf2, wlf<rbb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
