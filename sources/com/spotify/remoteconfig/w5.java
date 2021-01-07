package com.spotify.remoteconfig;

public final class w5 implements fjf<v5> {
    private final wlf<l0e> a;

    public w5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v5 v5Var = (v5) this.a.get().a(s4.a);
        yif.g(v5Var, "Cannot return null from a non-@Nullable @Provides method");
        return v5Var;
    }
}
