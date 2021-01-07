package com.spotify.remoteconfig;

public final class aa implements fjf<z9> {
    private final wlf<l0e> a;

    public aa(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        z9 z9Var = (z9) this.a.get().a(f2.a);
        yif.g(z9Var, "Cannot return null from a non-@Nullable @Provides method");
        return z9Var;
    }
}
