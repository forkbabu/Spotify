package com.spotify.http.contentaccesstoken;

import com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient;
import io.reactivex.y;

public final class l implements fjf<k> {
    private final wlf<ContentAccessTokenClient> a;
    private final wlf<c> b;
    private final wlf<y> c;

    public l(wlf<ContentAccessTokenClient> wlf, wlf<c> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get());
    }
}
