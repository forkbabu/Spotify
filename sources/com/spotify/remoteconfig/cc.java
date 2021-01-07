package com.spotify.remoteconfig;

public final class cc implements fjf<bc> {
    private final wlf<l0e> a;

    public cc(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        bc bcVar = (bc) this.a.get().a(e2.a);
        yif.g(bcVar, "Cannot return null from a non-@Nullable @Provides method");
        return bcVar;
    }
}
