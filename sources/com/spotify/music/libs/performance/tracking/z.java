package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;

public final class z implements fjf<d0> {
    private final wlf<ColdStartTracker> a;

    public z(wlf<ColdStartTracker> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get());
    }
}
