package com.spotify.remoteconfig;

public final class pc implements fjf<oc> {
    private final wlf<l0e> a;

    public pc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        oc ocVar = (oc) this.a.get().a(j2.a);
        yif.g(ocVar, "Cannot return null from a non-@Nullable @Provides method");
        return ocVar;
    }
}
