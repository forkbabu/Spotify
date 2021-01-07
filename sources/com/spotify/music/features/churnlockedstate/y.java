package com.spotify.music.features.churnlockedstate;

public final class y implements fjf<s> {
    private final wlf<w> a;
    private final wlf<io.reactivex.y> b;
    private final wlf<u> c;
    private final wlf<z> d;

    public y(wlf<w> wlf, wlf<io.reactivex.y> wlf2, wlf<u> wlf3, wlf<z> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get(), this.c.get(), this.b.get(), this.d.get());
    }
}
