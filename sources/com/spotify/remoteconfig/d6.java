package com.spotify.remoteconfig;

public final class d6 implements fjf<c6> {
    private final wlf<l0e> a;

    public d6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c6 c6Var = (c6) this.a.get().a(g1.a);
        yif.g(c6Var, "Cannot return null from a non-@Nullable @Provides method");
        return c6Var;
    }
}
