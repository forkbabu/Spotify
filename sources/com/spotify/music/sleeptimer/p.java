package com.spotify.music.sleeptimer;

public final class p implements fjf<o> {
    private final wlf<u> a;
    private final wlf<l> b;

    public p(wlf<u> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get());
    }
}
