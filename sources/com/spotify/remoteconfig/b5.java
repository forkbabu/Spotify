package com.spotify.remoteconfig;

public final class b5 implements fjf<a5> {
    private final wlf<l0e> a;

    public b5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a5 a5Var = (a5) this.a.get().a(u.a);
        yif.g(a5Var, "Cannot return null from a non-@Nullable @Provides method");
        return a5Var;
    }
}
