package com.spotify.remoteconfig;

public final class f6 implements fjf<e6> {
    private final wlf<l0e> a;

    public f6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e6 e6Var = (e6) this.a.get().a(o3.a);
        yif.g(e6Var, "Cannot return null from a non-@Nullable @Provides method");
        return e6Var;
    }
}
