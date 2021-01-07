package com.spotify.remoteconfig;

public final class d9 implements fjf<c9> {
    private final wlf<l0e> a;

    public d9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c9 c9Var = (c9) this.a.get().a(t1.a);
        yif.g(c9Var, "Cannot return null from a non-@Nullable @Provides method");
        return c9Var;
    }
}
