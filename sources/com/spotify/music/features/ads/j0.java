package com.spotify.music.features.ads;

import com.google.protobuf.u;
import com.spotify.http.w;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

public final class j0 implements fjf<i0> {
    private final wlf<RxWebToken> a;
    private final wlf<AndroidLibsAdsCommonProperties> b;
    private final wlf<gl0<u>> c;
    private final wlf<cqe> d;
    private final wlf<w> e;

    public j0(wlf<RxWebToken> wlf, wlf<AndroidLibsAdsCommonProperties> wlf2, wlf<gl0<u>> wlf3, wlf<cqe> wlf4, wlf<w> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
