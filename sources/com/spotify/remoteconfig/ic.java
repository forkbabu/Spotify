package com.spotify.remoteconfig;

public final class ic implements fjf<hc> {
    private final wlf<l0e> a;

    public ic(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hc hcVar = (hc) this.a.get().a(i0.a);
        yif.g(hcVar, "Cannot return null from a non-@Nullable @Provides method");
        return hcVar;
    }
}
