package com.spotify.remoteconfig;

public final class gc implements fjf<fc> {
    private final wlf<l0e> a;

    public gc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        fc fcVar = (fc) this.a.get().a(j4.a);
        yif.g(fcVar, "Cannot return null from a non-@Nullable @Provides method");
        return fcVar;
    }
}
