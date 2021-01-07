package com.spotify.remoteconfig;

public final class b6 implements fjf<a6> {
    private final wlf<l0e> a;

    public b6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a6 a6Var = (a6) this.a.get().a(a.a);
        yif.g(a6Var, "Cannot return null from a non-@Nullable @Provides method");
        return a6Var;
    }
}
