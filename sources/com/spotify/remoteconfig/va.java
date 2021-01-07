package com.spotify.remoteconfig;

public final class va implements fjf<ua> {
    private final wlf<l0e> a;

    public va(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ua uaVar = (ua) this.a.get().a(i4.a);
        yif.g(uaVar, "Cannot return null from a non-@Nullable @Provides method");
        return uaVar;
    }
}
