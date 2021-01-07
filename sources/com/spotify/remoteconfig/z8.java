package com.spotify.remoteconfig;

public final class z8 implements fjf<y8> {
    private final wlf<l0e> a;

    public z8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y8 y8Var = (y8) this.a.get().a(l2.a);
        yif.g(y8Var, "Cannot return null from a non-@Nullable @Provides method");
        return y8Var;
    }
}
