package com.spotify.http.wg;

import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.f;
import io.reactivex.w;
import io.reactivex.y;

public final class g implements fjf<f.a.b> {
    private final wlf<e> a;
    private final wlf<y> b;
    private final wlf<w<Response, TokenResponse>> c;

    public g(wlf<e> wlf, wlf<y> wlf2, wlf<w<Response, TokenResponse>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f.a.b(this.a.get(), this.b.get(), this.c.get());
    }
}
