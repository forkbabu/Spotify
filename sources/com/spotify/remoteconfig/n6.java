package com.spotify.remoteconfig;

public final class n6 implements fjf<m6> {
    private final wlf<l0e> a;

    public n6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m6 m6Var = (m6) this.a.get().a(n.a);
        yif.g(m6Var, "Cannot return null from a non-@Nullable @Provides method");
        return m6Var;
    }
}
