package com.spotify.remoteconfig;

public final class r9 implements fjf<q9> {
    private final wlf<l0e> a;

    public r9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q9 q9Var = (q9) this.a.get().a(c.a);
        yif.g(q9Var, "Cannot return null from a non-@Nullable @Provides method");
        return q9Var;
    }
}
