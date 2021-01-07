package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.tasteonboarding.c;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<m> a;
    private final wlf<f> b;
    private final wlf<c> c;
    private final wlf<y> d;
    private final wlf<fq8> e;
    private final wlf<Boolean> f;
    private final wlf<k> g;

    public h(wlf<m> wlf, wlf<f> wlf2, wlf<c> wlf3, wlf<y> wlf4, wlf<fq8> wlf5, wlf<Boolean> wlf6, wlf<k> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get().booleanValue(), this.g.get());
    }
}
