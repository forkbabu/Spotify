package com.spotify.remoteconfig;

public final class ib implements fjf<hb> {
    private final wlf<l0e> a;

    public ib(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hb hbVar = (hb) this.a.get().a(g4.a);
        yif.g(hbVar, "Cannot return null from a non-@Nullable @Provides method");
        return hbVar;
    }
}
