package com.spotify.remoteconfig;

public final class mj implements fjf<lj> {
    private final wlf<l0e> a;

    public mj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lj ljVar = (lj) this.a.get().a(x3.a);
        yif.g(ljVar, "Cannot return null from a non-@Nullable @Provides method");
        return ljVar;
    }
}
