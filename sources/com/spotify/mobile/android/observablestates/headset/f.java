package com.spotify.mobile.android.observablestates.headset;

import android.content.Context;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<Context> a;
    private final wlf<y> b;

    public f(wlf<Context> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
