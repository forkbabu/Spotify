package com.spotify.remoteconfig;

public final class y6 implements fjf<x6> {
    private final wlf<l0e> a;

    public y6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static x6 a(l0e l0e) {
        x6 x6Var = (x6) l0e.a(g2.a);
        yif.g(x6Var, "Cannot return null from a non-@Nullable @Provides method");
        return x6Var;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
