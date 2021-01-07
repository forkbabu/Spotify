package com.spotify.music.libs.performance.tracking;

import com.spotify.libs.instrumentation.performance.r;

public final class f0 implements fjf<e0> {
    private final wlf<r> a;

    public f0(wlf<r> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0(this.a.get());
    }
}
