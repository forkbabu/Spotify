package com.spotify.music.features.search.mobius;

public final class p0 implements fjf<o0> {
    private final wlf<hta> a;

    public p0(wlf<hta> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o0(this.a.get());
    }
}
