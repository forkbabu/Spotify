package com.spotify.remoteconfig;

public final class p9 implements fjf<o9> {
    private final wlf<l0e> a;

    public p9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o9 o9Var = (o9) this.a.get().a(z0.a);
        yif.g(o9Var, "Cannot return null from a non-@Nullable @Provides method");
        return o9Var;
    }
}
