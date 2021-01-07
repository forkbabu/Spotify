package com.spotify.remoteconfig;

public final class h5 implements fjf<g5> {
    private final wlf<l0e> a;

    public h5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g5 g5Var = (g5) this.a.get().a(t4.a);
        yif.g(g5Var, "Cannot return null from a non-@Nullable @Provides method");
        return g5Var;
    }
}
