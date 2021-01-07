package com.spotify.remoteconfig;

public final class c8 implements fjf<b8> {
    private final wlf<l0e> a;

    public c8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        b8 b8Var = (b8) this.a.get().a(z3.a);
        yif.g(b8Var, "Cannot return null from a non-@Nullable @Provides method");
        return b8Var;
    }
}
