package com.spotify.remoteconfig;

public final class a7 implements fjf<z6> {
    private final wlf<l0e> a;

    public a7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        z6 z6Var = (z6) this.a.get().a(k2.a);
        yif.g(z6Var, "Cannot return null from a non-@Nullable @Provides method");
        return z6Var;
    }
}
