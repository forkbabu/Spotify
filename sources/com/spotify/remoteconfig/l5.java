package com.spotify.remoteconfig;

public final class l5 implements fjf<k5> {
    private final wlf<l0e> a;

    public l5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k5 k5Var = (k5) this.a.get().a(g.a);
        yif.g(k5Var, "Cannot return null from a non-@Nullable @Provides method");
        return k5Var;
    }
}
