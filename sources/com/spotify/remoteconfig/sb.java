package com.spotify.remoteconfig;

public final class sb implements fjf<rb> {
    private final wlf<l0e> a;

    public sb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rb rbVar = (rb) this.a.get().a(n3.a);
        yif.g(rbVar, "Cannot return null from a non-@Nullable @Provides method");
        return rbVar;
    }
}
