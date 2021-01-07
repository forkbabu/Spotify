package com.spotify.music.libs.performance.tracking;

import android.app.Application;
import com.google.protobuf.u;
import com.spotify.libs.instrumentation.performance.j;
import com.spotify.libs.instrumentation.performance.r;
import io.reactivex.y;

public final class a0 implements fjf<r> {
    private final wlf<gl0<u>> a;
    private final wlf<Application> b;
    private final wlf<y> c;
    private final wlf<fd0> d;
    private final wlf<j> e;

    public a0(wlf<gl0<u>> wlf, wlf<Application> wlf2, wlf<y> wlf3, wlf<fd0> wlf4, wlf<j> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        c0 c0Var = new c0(this.c.get());
        c0Var.a(this.e.get());
        c0Var.a(new g0(this.a.get()));
        c0Var.a(new r(this.b.get().getApplicationContext(), this.d.get()));
        return c0Var;
    }
}
