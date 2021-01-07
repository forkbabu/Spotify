package com.spotify.remoteconfig;

public final class e5 implements fjf<d5> {
    private final wlf<l0e> a;

    public e5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d5 d5Var = (d5) this.a.get().a(x2.a);
        yif.g(d5Var, "Cannot return null from a non-@Nullable @Provides method");
        return d5Var;
    }
}
