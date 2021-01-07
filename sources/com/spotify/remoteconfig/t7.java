package com.spotify.remoteconfig;

public final class t7 implements fjf<s7> {
    private final wlf<l0e> a;

    public t7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s7 s7Var = (s7) this.a.get().a(y.a);
        yif.g(s7Var, "Cannot return null from a non-@Nullable @Provides method");
        return s7Var;
    }
}
