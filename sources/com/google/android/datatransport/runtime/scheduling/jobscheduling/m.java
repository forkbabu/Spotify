package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;

public final class m implements fjf<l> {
    private final wlf<Context> a;
    private final wlf<e> b;
    private final wlf<nh> c;
    private final wlf<r> d;
    private final wlf<Executor> e;
    private final wlf<a> f;
    private final wlf<ti> g;

    public m(wlf<Context> wlf, wlf<e> wlf2, wlf<nh> wlf3, wlf<r> wlf4, wlf<Executor> wlf5, wlf<a> wlf6, wlf<ti> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
