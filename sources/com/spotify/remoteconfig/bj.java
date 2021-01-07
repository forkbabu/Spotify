package com.spotify.remoteconfig;

public final class bj implements fjf<aj> {
    private final wlf<l0e> a;

    public bj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        aj ajVar = (aj) this.a.get().a(b0.a);
        yif.g(ajVar, "Cannot return null from a non-@Nullable @Provides method");
        return ajVar;
    }
}
