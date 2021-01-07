package com.spotify.remoteconfig;

public final class g8 implements fjf<f8> {
    private final wlf<l0e> a;

    public g8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f8 f8Var = (f8) this.a.get().a(o.a);
        yif.g(f8Var, "Cannot return null from a non-@Nullable @Provides method");
        return f8Var;
    }
}
