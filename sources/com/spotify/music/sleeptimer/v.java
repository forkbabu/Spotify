package com.spotify.music.sleeptimer;

public final class v implements fjf<u> {
    private final wlf<cqe> a;
    private final wlf<i> b;

    public v(wlf<cqe> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get());
    }
}
