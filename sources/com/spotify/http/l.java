package com.spotify.http;

import com.spotify.cosmos.android.FireAndForgetResolver;

public final class l implements fjf<k> {
    private final wlf<FireAndForgetResolver> a;
    private final wlf<o> b;

    public l(wlf<FireAndForgetResolver> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
