package com.spotify.remoteconfig;

public final class ec implements fjf<dc> {
    private final wlf<l0e> a;

    public ec(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        dc dcVar = (dc) this.a.get().a(o1.a);
        yif.g(dcVar, "Cannot return null from a non-@Nullable @Provides method");
        return dcVar;
    }
}
