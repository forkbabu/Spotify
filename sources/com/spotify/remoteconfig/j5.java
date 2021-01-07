package com.spotify.remoteconfig;

public final class j5 implements fjf<i5> {
    private final wlf<l0e> a;

    public j5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        i5 i5Var = (i5) this.a.get().a(a0.a);
        yif.g(i5Var, "Cannot return null from a non-@Nullable @Provides method");
        return i5Var;
    }
}
