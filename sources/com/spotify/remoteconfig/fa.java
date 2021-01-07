package com.spotify.remoteconfig;

public final class fa implements fjf<ea> {
    private final wlf<l0e> a;

    public fa(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ea eaVar = (ea) this.a.get().a(w2.a);
        yif.g(eaVar, "Cannot return null from a non-@Nullable @Provides method");
        return eaVar;
    }
}
