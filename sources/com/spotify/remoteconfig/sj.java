package com.spotify.remoteconfig;

public final class sj implements fjf<rj> {
    private final wlf<l0e> a;

    public sj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rj rjVar = (rj) this.a.get().a(o4.a);
        yif.g(rjVar, "Cannot return null from a non-@Nullable @Provides method");
        return rjVar;
    }
}
