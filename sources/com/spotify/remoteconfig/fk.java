package com.spotify.remoteconfig;

public final class fk implements fjf<ek> {
    private final wlf<l0e> a;

    public fk(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ek ekVar = (ek) this.a.get().a(r4.a);
        yif.g(ekVar, "Cannot return null from a non-@Nullable @Provides method");
        return ekVar;
    }
}
