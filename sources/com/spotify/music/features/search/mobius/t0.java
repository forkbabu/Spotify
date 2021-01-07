package com.spotify.music.features.search.mobius;

public final class t0 implements fjf<s0> {
    private final wlf<Boolean> a;
    private final wlf<i68> b;

    public t0(wlf<Boolean> wlf, wlf<i68> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get().booleanValue(), this.b.get());
    }
}
