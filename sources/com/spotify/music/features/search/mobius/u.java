package com.spotify.music.features.search.mobius;

public final class u implements fjf<t> {
    private final wlf<c8b> a;
    private final wlf<z> b;
    private final wlf<s6b> c;
    private final wlf<j81> d;

    public u(wlf<c8b> wlf, wlf<z> wlf2, wlf<s6b> wlf3, wlf<j81> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
