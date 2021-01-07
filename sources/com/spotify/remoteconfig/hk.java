package com.spotify.remoteconfig;

public final class hk implements fjf<gk> {
    private final wlf<l0e> a;

    public hk(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        gk gkVar = (gk) this.a.get().a(a2.a);
        yif.g(gkVar, "Cannot return null from a non-@Nullable @Provides method");
        return gkVar;
    }
}
