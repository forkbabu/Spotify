package com.spotify.remoteconfig;

public final class bk implements fjf<ak> {
    private final wlf<l0e> a;

    public bk(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ak akVar = (ak) this.a.get().a(k4.a);
        yif.g(akVar, "Cannot return null from a non-@Nullable @Provides method");
        return akVar;
    }
}
