package com.spotify.remoteconfig;

public final class eb implements fjf<db> {
    private final wlf<l0e> a;

    public eb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        db dbVar = (db) this.a.get().a(v4.a);
        yif.g(dbVar, "Cannot return null from a non-@Nullable @Provides method");
        return dbVar;
    }
}
