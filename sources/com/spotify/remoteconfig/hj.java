package com.spotify.remoteconfig;

public final class hj implements fjf<gj> {
    private final wlf<l0e> a;

    public hj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        gj gjVar = (gj) this.a.get().a(c2.a);
        yif.g(gjVar, "Cannot return null from a non-@Nullable @Provides method");
        return gjVar;
    }
}
