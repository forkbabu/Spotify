package com.spotify.libs.connect.nudge;

import androidx.appcompat.app.g;
import com.spotify.libs.connect.instrumentation.c;
import io.reactivex.y;

public final class e implements fjf<DefaultConnectNudgeAttacher> {
    private final wlf<g> a;
    private final wlf<c> b;
    private final wlf<qv0> c;
    private final wlf<pv0> d;
    private final wlf<d> e;
    private final wlf<y> f;
    private final wlf<Boolean> g;
    private final wlf<c> h;

    public e(wlf<g> wlf, wlf<c> wlf2, wlf<qv0> wlf3, wlf<pv0> wlf4, wlf<d> wlf5, wlf<y> wlf6, wlf<Boolean> wlf7, wlf<c> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultConnectNudgeAttacher(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get().booleanValue(), this.h.get());
    }
}
