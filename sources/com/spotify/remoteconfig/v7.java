package com.spotify.remoteconfig;

public final class v7 implements fjf<u7> {
    private final wlf<l0e> a;

    public v7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static u7 a(l0e l0e) {
        u7 u7Var = (u7) l0e.a(p2.a);
        yif.g(u7Var, "Cannot return null from a non-@Nullable @Provides method");
        return u7Var;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
