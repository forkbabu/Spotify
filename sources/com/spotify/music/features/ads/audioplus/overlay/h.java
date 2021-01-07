package com.spotify.music.features.ads.audioplus.overlay;

import com.spotify.ads.uicomponents.secondaryintent.b;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.features.ads.audioplus.d;

public final class h implements fjf<g> {
    private final wlf<d> a;
    private final wlf<vp3> b;
    private final wlf<bq3> c;
    private final wlf<ws3> d;
    private final wlf<b> e;
    private final wlf<o0> f;

    public h(wlf<d> wlf, wlf<vp3> wlf2, wlf<bq3> wlf3, wlf<ws3> wlf4, wlf<b> wlf5, wlf<o0> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
