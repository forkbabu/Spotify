package com.spotify.remoteconfig;

public final class r8 implements fjf<q8> {
    private final wlf<l0e> a;

    public r8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q8 q8Var = (q8) this.a.get().a(d.a);
        yif.g(q8Var, "Cannot return null from a non-@Nullable @Provides method");
        return q8Var;
    }
}
