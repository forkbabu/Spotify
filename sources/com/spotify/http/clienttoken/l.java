package com.spotify.http.clienttoken;

import com.spotify.cosmos.clienttoken.ClientTokenClient;

public final class l implements fjf<k> {
    private final wlf<ClientTokenClient> a;
    private final wlf<c> b;

    public l(wlf<ClientTokenClient> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
