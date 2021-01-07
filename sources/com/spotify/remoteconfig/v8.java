package com.spotify.remoteconfig;

public final class v8 implements fjf<u8> {
    private final wlf<l0e> a;

    public v8(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u8 u8Var = (u8) this.a.get().a(v2.a);
        yif.g(u8Var, "Cannot return null from a non-@Nullable @Provides method");
        return u8Var;
    }
}
