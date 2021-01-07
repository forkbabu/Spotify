package com.spotify.remoteconfig;

public final class za implements fjf<ya> {
    private final wlf<l0e> a;

    public za(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ya yaVar = (ya) this.a.get().a(s0.a);
        yif.g(yaVar, "Cannot return null from a non-@Nullable @Provides method");
        return yaVar;
    }
}
