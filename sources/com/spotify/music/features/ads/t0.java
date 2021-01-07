package com.spotify.music.features.ads;

import com.spotify.cosmos.router.Response;
import com.spotify.music.productstate.c;
import io.reactivex.w;

public final class t0 implements fjf<w<Response, Response>> {
    private final wlf<c> a;

    public t0(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get());
    }
}
