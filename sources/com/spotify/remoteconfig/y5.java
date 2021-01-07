package com.spotify.remoteconfig;

public final class y5 implements fjf<x5> {
    private final wlf<l0e> a;

    public y5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        x5 x5Var = (x5) this.a.get().a(c3.a);
        yif.g(x5Var, "Cannot return null from a non-@Nullable @Provides method");
        return x5Var;
    }
}
