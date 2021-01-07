package com.spotify.music;

public final class r0 implements fjf<q0> {
    private final wlf<z0> a;

    public r0(wlf<z0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q0(this.a.get());
    }
}
