package com.spotify.remoteconfig;

public final class t6 implements fjf<s6> {
    private final wlf<l0e> a;

    public t6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s6 s6Var = (s6) this.a.get().a(v3.a);
        yif.g(s6Var, "Cannot return null from a non-@Nullable @Provides method");
        return s6Var;
    }
}
