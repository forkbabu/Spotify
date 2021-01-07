package com.spotify.remoteconfig;

public final class ta implements fjf<sa> {
    private final wlf<l0e> a;

    public ta(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static sa a(l0e l0e) {
        sa saVar = (sa) l0e.a(m4.a);
        yif.g(saVar, "Cannot return null from a non-@Nullable @Provides method");
        return saVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
