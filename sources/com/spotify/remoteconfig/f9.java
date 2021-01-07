package com.spotify.remoteconfig;

public final class f9 implements fjf<e9> {
    private final wlf<l0e> a;

    public f9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e9 e9Var = (e9) this.a.get().a(e3.a);
        yif.g(e9Var, "Cannot return null from a non-@Nullable @Provides method");
        return e9Var;
    }
}
