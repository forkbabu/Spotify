package com.spotify.mobile.android.service.media.search;

import android.content.Context;
import com.spotify.http.u;
import com.spotify.http.w;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public final class p implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<u> b;
    private final wlf<g> c;
    private final wlf<cqe> d;
    private final wlf<w> e;
    private final wlf<i> f;

    public p(wlf<Context> wlf, wlf<u> wlf2, wlf<g> wlf3, wlf<cqe> wlf4, wlf<w> wlf5, wlf<i> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
