package com.spotify.remoteconfig;

public final class dj implements fjf<cj> {
    private final wlf<l0e> a;

    public dj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        cj cjVar = (cj) this.a.get().a(y1.a);
        yif.g(cjVar, "Cannot return null from a non-@Nullable @Provides method");
        return cjVar;
    }
}
