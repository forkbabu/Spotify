package com.spotify.music.features.ads;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.music.features.ads.model.AdBreakState;
import io.reactivex.s;

public final class u0 implements fjf<s<AdBreakState>> {
    private final wlf<RxResolver> a;

    public u0(wlf<RxResolver> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().resolve(new Request(Request.SUB, "sp://ads/v1/break/state")).j0(d0.a).j0(o.a);
    }
}
