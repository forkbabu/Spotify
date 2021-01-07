package com.spotify.music.features.search.mobius;

public final class d0 implements fjf<c0> {
    private final wlf<hb8> a;
    private final wlf<mb8> b;
    private final wlf<jb8> c;
    private final wlf<lb8> d;

    public d0(wlf<hb8> wlf, wlf<mb8> wlf2, wlf<jb8> wlf3, wlf<lb8> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
