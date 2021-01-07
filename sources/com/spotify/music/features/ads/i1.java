package com.spotify.music.features.ads;

public final class i1 implements fjf<pt3> {
    private final wlf<dqe> a;
    private final wlf<wt3> b;
    private final wlf<st3> c;

    public i1(wlf<dqe> wlf, wlf<wt3> wlf2, wlf<st3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pt3(this.a.get(), this.b.get(), this.c.get());
    }
}
