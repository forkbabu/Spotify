package com.spotify.remoteconfig;

public final class k9 implements fjf<j9> {
    private final wlf<l0e> a;

    public k9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        j9 j9Var = (j9) this.a.get().a(j0.a);
        yif.g(j9Var, "Cannot return null from a non-@Nullable @Provides method");
        return j9Var;
    }
}
