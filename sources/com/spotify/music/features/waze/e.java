package com.spotify.music.features.waze;

import com.spotify.mobile.android.waze.model.b;
import io.reactivex.s;

public final class e implements fjf<d> {
    private final wlf<b> a;
    private final wlf<g92> b;
    private final wlf<e92> c;
    private final wlf<r92> d;
    private final wlf<vla> e;
    private final wlf<s<Boolean>> f;

    public e(wlf<b> wlf, wlf<g92> wlf2, wlf<e92> wlf3, wlf<r92> wlf4, wlf<vla> wlf5, wlf<s<Boolean>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
