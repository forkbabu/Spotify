package com.spotify.remoteconfig;

public final class x9 implements fjf<w9> {
    private final wlf<l0e> a;

    public x9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w9 w9Var = (w9) this.a.get().a(h2.a);
        yif.g(w9Var, "Cannot return null from a non-@Nullable @Provides method");
        return w9Var;
    }
}
