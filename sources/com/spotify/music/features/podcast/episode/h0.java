package com.spotify.music.features.podcast.episode;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import io.reactivex.y;

public final class h0 implements fjf<g0> {
    private final wlf<ExplicitContentFacade> a;
    private final wlf<y> b;
    private final wlf<k> c;

    public h0(wlf<ExplicitContentFacade> wlf, wlf<y> wlf2, wlf<k> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g0(this.a.get(), this.b.get(), this.c.get());
    }
}
