package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import com.spotify.music.libs.assistedcuration.b;

public final class q0 implements fjf<p0> {
    private final wlf<Activity> a;
    private final wlf<n1a> b;
    private final wlf<z> c;
    private final wlf<z0a> d;
    private final wlf<b1a> e;
    private final wlf<b> f;

    public q0(wlf<Activity> wlf, wlf<n1a> wlf2, wlf<z> wlf3, wlf<z0a> wlf4, wlf<b1a> wlf5, wlf<b> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
