package com.spotify.music.offlinetrials.limited.logging;

public final class b implements fjf<a> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public b(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a, this.b);
    }
}
