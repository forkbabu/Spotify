package com.spotify.remoteconfig;

public final class yj implements fjf<xj> {
    private final wlf<l0e> a;

    public yj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        xj xjVar = (xj) this.a.get().a(f4.a);
        yif.g(xjVar, "Cannot return null from a non-@Nullable @Provides method");
        return xjVar;
    }
}
