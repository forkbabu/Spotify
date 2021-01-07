package com.spotify.remoteconfig;

public final class c7 implements fjf<b7> {
    private final wlf<l0e> a;

    public c7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        b7 b7Var = (b7) this.a.get().a(l4.a);
        yif.g(b7Var, "Cannot return null from a non-@Nullable @Provides method");
        return b7Var;
    }
}
