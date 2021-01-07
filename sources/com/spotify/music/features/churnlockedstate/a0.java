package com.spotify.music.features.churnlockedstate;

import android.app.Application;
import com.spotify.mobile.android.service.o;

public final class a0 implements fjf<z> {
    private final wlf<o> a;
    private final wlf<Application> b;

    public a0(wlf<o> wlf, wlf<Application> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get(), this.b.get());
    }
}
