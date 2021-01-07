package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.libs.instrumentation.performance.j;

public final class w implements fjf<j> {
    private final wlf<ColdStartTracker> a;

    public w(wlf<ColdStartTracker> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get());
    }
}
