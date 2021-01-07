package com.spotify.remoteconfig;

public final class dk implements fjf<ck> {
    private final wlf<l0e> a;

    public dk(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ck ckVar = (ck) this.a.get().a(l0.a);
        yif.g(ckVar, "Cannot return null from a non-@Nullable @Provides method");
        return ckVar;
    }
}
