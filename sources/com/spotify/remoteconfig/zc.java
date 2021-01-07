package com.spotify.remoteconfig;

public final class zc implements fjf<yc> {
    private final wlf<l0e> a;

    public zc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yc ycVar = (yc) this.a.get().a(y2.a);
        yif.g(ycVar, "Cannot return null from a non-@Nullable @Provides method");
        return ycVar;
    }
}
