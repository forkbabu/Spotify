package com.spotify.music;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.libs.performance.tracking.d0;

public final class x0 implements fjf<w0> {
    private final wlf<ColdStartTracker> a;
    private final wlf<d0> b;
    private final wlf<ProcessType> c;
    private final wlf<cqe> d;
    private final wlf<String> e;

    public x0(wlf<ColdStartTracker> wlf, wlf<d0> wlf2, wlf<ProcessType> wlf3, wlf<cqe> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
