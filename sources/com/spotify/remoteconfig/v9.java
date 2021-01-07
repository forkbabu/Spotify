package com.spotify.remoteconfig;

public final class v9 implements fjf<u9> {
    private final wlf<l0e> a;

    public v9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u9 u9Var = (u9) this.a.get().a(b1.a);
        yif.g(u9Var, "Cannot return null from a non-@Nullable @Provides method");
        return u9Var;
    }
}
