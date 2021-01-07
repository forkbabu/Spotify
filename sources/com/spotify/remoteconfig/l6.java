package com.spotify.remoteconfig;

public final class l6 implements fjf<k6> {
    private final wlf<l0e> a;

    public l6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        k6 k6Var = (k6) this.a.get().a(j3.a);
        yif.g(k6Var, "Cannot return null from a non-@Nullable @Provides method");
        return k6Var;
    }
}
