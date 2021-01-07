package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import com.spotify.music.libs.assistedcuration.b;

public final class y0 implements fjf<x0> {
    private final wlf<Activity> a;
    private final wlf<j1a> b;
    private final wlf<z> c;
    private final wlf<b> d;

    public y0(wlf<Activity> wlf, wlf<j1a> wlf2, wlf<z> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
