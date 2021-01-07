package com.spotify.libs.connect.volume;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.providers.h;
import io.reactivex.y;

public final class e implements fjf<d> {
    private final wlf<f> a;
    private final wlf<h> b;
    private final wlf<gv0> c;
    private final wlf<l> d;
    private final wlf<g> e;
    private final wlf<ConnectVolumeControlInstrumentation> f;
    private final wlf<y> g;

    public e(wlf<f> wlf, wlf<h> wlf2, wlf<gv0> wlf3, wlf<l> wlf4, wlf<g> wlf5, wlf<ConnectVolumeControlInstrumentation> wlf6, wlf<y> wlf7) {
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
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
