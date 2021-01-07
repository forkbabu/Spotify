package com.spotify.remoteconfig;

public final class p8 implements fjf<o8> {
    private final wlf<l0e> a;

    public p8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o8 o8Var = (o8) this.a.get().a(e0.a);
        yif.g(o8Var, "Cannot return null from a non-@Nullable @Provides method");
        return o8Var;
    }
}
