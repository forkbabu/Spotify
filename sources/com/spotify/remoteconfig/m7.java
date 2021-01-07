package com.spotify.remoteconfig;

public final class m7 implements fjf<l7> {
    private final wlf<l0e> a;

    public m7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l7 l7Var = (l7) this.a.get().a(x.a);
        yif.g(l7Var, "Cannot return null from a non-@Nullable @Provides method");
        return l7Var;
    }
}
