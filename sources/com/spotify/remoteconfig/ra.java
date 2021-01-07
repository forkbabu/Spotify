package com.spotify.remoteconfig;

public final class ra implements fjf<qa> {
    private final wlf<l0e> a;

    public ra(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qa qaVar = (qa) this.a.get().a(c1.a);
        yif.g(qaVar, "Cannot return null from a non-@Nullable @Provides method");
        return qaVar;
    }
}
