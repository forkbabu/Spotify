package com.spotify.remoteconfig;

public final class i8 implements fjf<h8> {
    private final wlf<l0e> a;

    public i8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        h8 h8Var = (h8) this.a.get().a(f.a);
        yif.g(h8Var, "Cannot return null from a non-@Nullable @Provides method");
        return h8Var;
    }
}
