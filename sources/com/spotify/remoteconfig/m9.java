package com.spotify.remoteconfig;

public final class m9 implements fjf<l9> {
    private final wlf<l0e> a;

    public m9(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l9 l9Var = (l9) this.a.get().a(h1.a);
        yif.g(l9Var, "Cannot return null from a non-@Nullable @Provides method");
        return l9Var;
    }
}
