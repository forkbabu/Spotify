package com.spotify.remoteconfig;

public final class zb implements fjf<yb> {
    private final wlf<l0e> a;

    public zb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yb ybVar = (yb) this.a.get().a(u1.a);
        yif.g(ybVar, "Cannot return null from a non-@Nullable @Provides method");
        return ybVar;
    }
}
