package com.spotify.remoteconfig;

public final class y4 implements fjf<x4> {
    private final wlf<l0e> a;

    public y4(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        x4 x4Var = (x4) this.a.get().a(m1.a);
        yif.g(x4Var, "Cannot return null from a non-@Nullable @Provides method");
        return x4Var;
    }
}
