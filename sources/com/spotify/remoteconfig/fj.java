package com.spotify.remoteconfig;

public final class fj implements fjf<ej> {
    private final wlf<l0e> a;

    public fj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ej ejVar = (ej) this.a.get().a(k0.a);
        yif.g(ejVar, "Cannot return null from a non-@Nullable @Provides method");
        return ejVar;
    }
}
