package com.spotify.music.features.yourepisodes;

import com.spotify.ubi.specification.factories.n4;
import kotlin.jvm.internal.h;

public final class v implements fjf<a0> {
    private final wlf<ere> a;
    private final wlf<n4> b;

    public v(wlf<ere> wlf, wlf<n4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        ere ere = this.a.get();
        n4 n4Var = this.b.get();
        h.e(ere, "ubi");
        h.e(n4Var, "eventFactory");
        return new b0(ere, n4Var);
    }
}
