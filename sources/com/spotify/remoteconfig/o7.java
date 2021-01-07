package com.spotify.remoteconfig;

public final class o7 implements fjf<n7> {
    private final wlf<l0e> a;

    public o7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        n7 n7Var = (n7) this.a.get().a(c4.a);
        yif.g(n7Var, "Cannot return null from a non-@Nullable @Provides method");
        return n7Var;
    }
}
