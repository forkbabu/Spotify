package com.spotify.remoteconfig;

public final class a8 implements fjf<z7> {
    private final wlf<l0e> a;

    public a8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        z7 z7Var = (z7) this.a.get().a(m2.a);
        yif.g(z7Var, "Cannot return null from a non-@Nullable @Provides method");
        return z7Var;
    }
}
