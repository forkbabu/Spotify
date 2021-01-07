package com.spotify.remoteconfig;

public final class mb implements fjf<lb> {
    private final wlf<l0e> a;

    public mb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        lb lbVar = (lb) this.a.get().a(f3.a);
        yif.g(lbVar, "Cannot return null from a non-@Nullable @Provides method");
        return lbVar;
    }
}
