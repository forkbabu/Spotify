package com.spotify.remoteconfig;

public final class t9 implements fjf<s9> {
    private final wlf<l0e> a;

    public t9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s9 s9Var = (s9) this.a.get().a(b2.a);
        yif.g(s9Var, "Cannot return null from a non-@Nullable @Provides method");
        return s9Var;
    }
}
