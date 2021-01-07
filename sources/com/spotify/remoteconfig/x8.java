package com.spotify.remoteconfig;

public final class x8 implements fjf<w8> {
    private final wlf<l0e> a;

    public x8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w8 w8Var = (w8) this.a.get().a(q.a);
        yif.g(w8Var, "Cannot return null from a non-@Nullable @Provides method");
        return w8Var;
    }
}
