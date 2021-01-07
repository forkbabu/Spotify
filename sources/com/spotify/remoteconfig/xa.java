package com.spotify.remoteconfig;

public final class xa implements fjf<wa> {
    private final wlf<l0e> a;

    public xa(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        wa waVar = (wa) this.a.get().a(s.a);
        yif.g(waVar, "Cannot return null from a non-@Nullable @Provides method");
        return waVar;
    }
}
