package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import com.spotify.podcast.endpoints.collection.d;
import io.reactivex.y;

public final class b implements fjf<a> {
    private final wlf<d> a;
    private final wlf<String> b;
    private final wlf<d.a> c;
    private final wlf<pnc> d;
    private final wlf<y> e;

    public b(wlf<d> wlf, wlf<String> wlf2, wlf<d.a> wlf3, wlf<pnc> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
