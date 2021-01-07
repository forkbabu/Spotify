package com.spotify.music.sleeptimer;

public final class t implements fjf<s> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public t(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get());
    }
}
