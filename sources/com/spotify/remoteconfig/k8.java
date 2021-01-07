package com.spotify.remoteconfig;

public final class k8 implements fjf<j8> {
    private final wlf<l0e> a;

    public k8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j8 j8Var = (j8) this.a.get().a(f1.a);
        yif.g(j8Var, "Cannot return null from a non-@Nullable @Provides method");
        return j8Var;
    }
}
