package com.spotify.remoteconfig;

public final class uj implements fjf<tj> {
    private final wlf<l0e> a;

    public uj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        tj tjVar = (tj) this.a.get().a(c0.a);
        yif.g(tjVar, "Cannot return null from a non-@Nullable @Provides method");
        return tjVar;
    }
}
