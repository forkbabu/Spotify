package com.spotify.music.features.browse.localcache;

import android.content.Context;
import com.spotify.music.json.g;
import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<g> c;
    private final wlf<HubsCachedFeature> d;
    private final wlf<y> e;

    public h(wlf<Context> wlf, wlf<String> wlf2, wlf<g> wlf3, wlf<HubsCachedFeature> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
