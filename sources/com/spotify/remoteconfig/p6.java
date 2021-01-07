package com.spotify.remoteconfig;

public final class p6 implements fjf<o6> {
    private final wlf<l0e> a;

    public p6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o6 o6Var = (o6) this.a.get().a(d1.a);
        yif.g(o6Var, "Cannot return null from a non-@Nullable @Provides method");
        return o6Var;
    }
}
