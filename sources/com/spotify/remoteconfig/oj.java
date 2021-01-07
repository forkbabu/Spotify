package com.spotify.remoteconfig;

public final class oj implements fjf<nj> {
    private final wlf<l0e> a;

    public oj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        nj njVar = (nj) this.a.get().a(m.a);
        yif.g(njVar, "Cannot return null from a non-@Nullable @Provides method");
        return njVar;
    }
}
