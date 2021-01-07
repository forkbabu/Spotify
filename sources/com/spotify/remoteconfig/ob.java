package com.spotify.remoteconfig;

public final class ob implements fjf<nb> {
    private final wlf<l0e> a;

    public ob(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static nb a(l0e l0e) {
        nb nbVar = (nb) l0e.a(t0.a);
        yif.g(nbVar, "Cannot return null from a non-@Nullable @Provides method");
        return nbVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
