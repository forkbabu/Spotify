package com.spotify.remoteconfig;

public final class n5 implements fjf<m5> {
    private final wlf<l0e> a;

    public n5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m5 m5Var = (m5) this.a.get().a(p3.a);
        yif.g(m5Var, "Cannot return null from a non-@Nullable @Provides method");
        return m5Var;
    }
}
