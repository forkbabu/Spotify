package com.spotify.music.builtinauth.cache;

public final class k0 implements fjf<j0> {
    private final wlf<cqe> a;

    public k0(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j0(this.a.get());
    }
}
