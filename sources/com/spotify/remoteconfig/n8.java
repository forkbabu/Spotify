package com.spotify.remoteconfig;

public final class n8 implements fjf<m8> {
    private final wlf<l0e> a;

    public n8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        m8 m8Var = (m8) this.a.get().a(v1.a);
        yif.g(m8Var, "Cannot return null from a non-@Nullable @Provides method");
        return m8Var;
    }
}
