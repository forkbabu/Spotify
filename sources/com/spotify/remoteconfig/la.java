package com.spotify.remoteconfig;

public final class la implements fjf<ka> {
    private final wlf<l0e> a;

    public la(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ka kaVar = (ka) this.a.get().a(r0.a);
        yif.g(kaVar, "Cannot return null from a non-@Nullable @Provides method");
        return kaVar;
    }
}
