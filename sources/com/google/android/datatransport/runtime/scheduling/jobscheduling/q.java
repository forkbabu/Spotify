package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;

public final class q implements fjf<p> {
    private final wlf<Executor> a;
    private final wlf<nh> b;
    private final wlf<r> c;
    private final wlf<a> d;

    public q(wlf<Executor> wlf, wlf<nh> wlf2, wlf<r> wlf3, wlf<a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
