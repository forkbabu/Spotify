package com.spotify.remoteconfig;

public final class u5 implements fjf<t5> {
    private final wlf<l0e> a;

    public u5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t5 t5Var = (t5) this.a.get().a(s2.a);
        yif.g(t5Var, "Cannot return null from a non-@Nullable @Provides method");
        return t5Var;
    }
}
