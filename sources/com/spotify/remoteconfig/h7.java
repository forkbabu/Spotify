package com.spotify.remoteconfig;

public final class h7 implements fjf<g7> {
    private final wlf<l0e> a;

    public h7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static g7 a(l0e l0e) {
        g7 g7Var = (g7) l0e.a(r1.a);
        yif.g(g7Var, "Cannot return null from a non-@Nullable @Provides method");
        return g7Var;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
