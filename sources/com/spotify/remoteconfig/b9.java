package com.spotify.remoteconfig;

public final class b9 implements fjf<a9> {
    private final wlf<l0e> a;

    public b9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a9 a9Var = (a9) this.a.get().a(n2.a);
        yif.g(a9Var, "Cannot return null from a non-@Nullable @Provides method");
        return a9Var;
    }
}
