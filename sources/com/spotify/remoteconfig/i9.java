package com.spotify.remoteconfig;

public final class i9 implements fjf<h9> {
    private final wlf<l0e> a;

    public i9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        h9 h9Var = (h9) this.a.get().a(l1.a);
        yif.g(h9Var, "Cannot return null from a non-@Nullable @Provides method");
        return h9Var;
    }
}
