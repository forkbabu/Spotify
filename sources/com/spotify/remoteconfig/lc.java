package com.spotify.remoteconfig;

public final class lc implements fjf<kc> {
    private final wlf<l0e> a;

    public lc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        kc kcVar = (kc) this.a.get().a(g0.a);
        yif.g(kcVar, "Cannot return null from a non-@Nullable @Provides method");
        return kcVar;
    }
}
