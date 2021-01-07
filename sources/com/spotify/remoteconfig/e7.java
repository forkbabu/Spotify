package com.spotify.remoteconfig;

public final class e7 implements fjf<d7> {
    private final wlf<l0e> a;

    public e7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d7 d7Var = (d7) this.a.get().a(h0.a);
        yif.g(d7Var, "Cannot return null from a non-@Nullable @Provides method");
        return d7Var;
    }
}
