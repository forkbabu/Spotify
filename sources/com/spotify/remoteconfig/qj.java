package com.spotify.remoteconfig;

public final class qj implements fjf<pj> {
    private final wlf<l0e> a;

    public qj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        pj pjVar = (pj) this.a.get().a(p1.a);
        yif.g(pjVar, "Cannot return null from a non-@Nullable @Provides method");
        return pjVar;
    }
}
