package com.spotify.music.features.pushnotifications;

import android.content.Context;
import androidx.core.app.q;

public final class j0 implements fjf<i0> {
    private final wlf<Context> a;
    private final wlf<q> b;

    public j0(wlf<Context> wlf, wlf<q> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0(this.a.get(), this.b.get());
    }
}
