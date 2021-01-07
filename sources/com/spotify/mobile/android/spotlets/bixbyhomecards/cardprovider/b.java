package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.f;

public final class b implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<f> b;

    public b(wlf<Context> wlf, wlf<f> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
