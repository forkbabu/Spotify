package com.spotify.remoteconfig;

public final class tc implements fjf<sc> {
    private final wlf<l0e> a;

    public tc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sc scVar = (sc) this.a.get().a(s3.a);
        yif.g(scVar, "Cannot return null from a non-@Nullable @Provides method");
        return scVar;
    }
}
