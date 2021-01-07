package com.spotify.remoteconfig;

public final class na implements fjf<ma> {
    private final wlf<l0e> a;

    public na(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ma maVar = (ma) this.a.get().a(p.a);
        yif.g(maVar, "Cannot return null from a non-@Nullable @Provides method");
        return maVar;
    }
}
