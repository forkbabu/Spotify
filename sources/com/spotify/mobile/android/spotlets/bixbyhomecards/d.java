package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider.a;

public final class d implements fjf<c> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<h> c;

    public d(wlf<Context> wlf, wlf<a> wlf2, wlf<h> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
