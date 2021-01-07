package com.spotify.remoteconfig;

public final class r5 implements fjf<q5> {
    private final wlf<l0e> a;

    public r5(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q5 q5Var = (q5) this.a.get().a(e.a);
        yif.g(q5Var, "Cannot return null from a non-@Nullable @Provides method");
        return q5Var;
    }
}
