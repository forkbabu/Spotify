package com.spotify.http;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.music.spotlets.offline.util.c;
import io.reactivex.s;
import io.reactivex.y;

public final class n implements fjf<m> {
    private final wlf<WebgateTokenProvider> a;
    private final wlf<q> b;
    private final wlf<tn0> c;
    private final wlf<j> d;
    private final wlf<c> e;
    private final wlf<s<ng0>> f;
    private final wlf<y> g;

    public n(wlf<WebgateTokenProvider> wlf, wlf<q> wlf2, wlf<tn0> wlf3, wlf<j> wlf4, wlf<c> wlf5, wlf<s<ng0>> wlf6, wlf<y> wlf7) {
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
        return new m(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
