package com.spotify.remoteconfig;

public final class ja implements fjf<ia> {
    private final wlf<l0e> a;

    public ja(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ia iaVar = (ia) this.a.get().a(m3.a);
        yif.g(iaVar, "Cannot return null from a non-@Nullable @Provides method");
        return iaVar;
    }
}
