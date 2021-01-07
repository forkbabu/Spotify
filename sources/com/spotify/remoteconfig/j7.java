package com.spotify.remoteconfig;

public final class j7 implements fjf<i7> {
    private final wlf<l0e> a;

    public j7(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static i7 a(l0e l0e) {
        i7 i7Var = (i7) l0e.a(a4.a);
        yif.g(i7Var, "Cannot return null from a non-@Nullable @Provides method");
        return i7Var;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
