package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<y> a;
    private final wlf<g> b;
    private final wlf<ga7> c;
    private final wlf<j97> d;
    private final wlf<q97> e;

    public f(wlf<y> wlf, wlf<g> wlf2, wlf<ga7> wlf3, wlf<j97> wlf4, wlf<q97> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
