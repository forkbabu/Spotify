package com.spotify.music.connection;

import io.reactivex.s;

public final class h implements fjf<s<g>> {
    private final wlf<k> a;
    private final wlf<n> b;

    public h(wlf<k> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return s.n(this.a.get().b().j0(f.a), this.b.get().b(), a.a).E().v0(1).h1();
    }
}
