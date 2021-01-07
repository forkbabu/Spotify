package com.spotify.remoteconfig;

public final class x7 implements fjf<w7> {
    private final wlf<l0e> a;

    public x7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w7 w7Var = (w7) this.a.get().a(y3.a);
        yif.g(w7Var, "Cannot return null from a non-@Nullable @Provides method");
        return w7Var;
    }
}
