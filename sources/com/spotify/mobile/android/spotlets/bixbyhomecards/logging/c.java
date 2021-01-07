package com.spotify.mobile.android.spotlets.bixbyhomecards.logging;

import com.google.protobuf.u;

public final class c implements fjf<StreamingCardEventLogger> {
    private final wlf<a> a;
    private final wlf<gl0<u>> b;

    public c(wlf<a> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new StreamingCardEventLogger(this.a.get(), this.b.get());
    }
}
