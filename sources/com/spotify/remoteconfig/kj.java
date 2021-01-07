package com.spotify.remoteconfig;

public final class kj implements fjf<jj> {
    private final wlf<l0e> a;

    public kj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        jj jjVar = (jj) this.a.get().a(p4.a);
        yif.g(jjVar, "Cannot return null from a non-@Nullable @Provides method");
        return jjVar;
    }
}
