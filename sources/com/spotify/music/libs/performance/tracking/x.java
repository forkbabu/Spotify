package com.spotify.music.libs.performance.tracking;

import android.app.Application;
import androidx.lifecycle.Lifecycle;
import com.google.protobuf.u;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.performancesdk.timekeeper.m;

public final class x implements fjf<ColdStartTracker> {
    private final wlf<m> a;
    private final wlf<gl0<u>> b;
    private final wlf<s> c;
    private final wlf<Application> d;

    public x(wlf<m> wlf, wlf<gl0<u>> wlf2, wlf<s> wlf3, wlf<Application> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        m mVar = this.a.get();
        s sVar = this.c.get();
        Lifecycle A = ((androidx.lifecycle.x) androidx.lifecycle.x.g()).A();
        q qVar = new q(this.b.get());
        sVar.getClass();
        return new ColdStartTracker(A, mVar, qVar, new a(sVar), this.d.get().getApplicationContext());
    }
}
