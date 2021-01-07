package com.spotify.remoteconfig;

public final class nc implements fjf<mc> {
    private final wlf<l0e> a;

    public nc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        mc mcVar = (mc) this.a.get().a(n1.a);
        yif.g(mcVar, "Cannot return null from a non-@Nullable @Provides method");
        return mcVar;
    }
}
