package com.spotify.remoteconfig;

public final class r6 implements fjf<q6> {
    private final wlf<l0e> a;

    public r6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q6 q6Var = (q6) this.a.get().a(p0.a);
        yif.g(q6Var, "Cannot return null from a non-@Nullable @Provides method");
        return q6Var;
    }
}
