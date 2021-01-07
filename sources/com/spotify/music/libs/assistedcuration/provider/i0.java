package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import com.spotify.music.libs.assistedcuration.b;

public final class i0 implements fjf<h0> {
    private final wlf<Activity> a;
    private final wlf<faa> b;
    private final wlf<z> c;
    private final wlf<b> d;

    public i0(wlf<Activity> wlf, wlf<faa> wlf2, wlf<z> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
