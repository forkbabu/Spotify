package com.spotify.remoteconfig;

public final class v6 implements fjf<u6> {
    private final wlf<l0e> a;

    public v6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u6 u6Var = (u6) this.a.get().a(a1.a);
        yif.g(u6Var, "Cannot return null from a non-@Nullable @Provides method");
        return u6Var;
    }
}
