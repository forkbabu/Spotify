package com.spotify.music.libs.performance.tracking;

import android.app.Application;
import android.os.Handler;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.performancesdk.timekeeper.m;

public final class b0 implements fjf<h0> {
    private final wlf<m> a;
    private final wlf<r> b;
    private final wlf<Handler> c;
    private final wlf<Application> d;

    public b0(wlf<m> wlf, wlf<r> wlf2, wlf<Handler> wlf3, wlf<Application> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get(), this.c.get(), this.d.get().getApplicationContext());
    }
}
