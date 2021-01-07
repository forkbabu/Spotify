package com.spotify.remoteconfig;

public final class ca implements fjf<ba> {
    private final wlf<l0e> a;

    public ca(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ba baVar = (ba) this.a.get().a(k3.a);
        yif.g(baVar, "Cannot return null from a non-@Nullable @Provides method");
        return baVar;
    }
}
