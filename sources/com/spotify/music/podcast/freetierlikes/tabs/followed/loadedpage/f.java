package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.d0;
import io.reactivex.y;

public final class f implements fjf<LoadedFollowedShowsPresenterImpl> {
    private final wlf<y> a;
    private final wlf<g> b;
    private final wlf<d0> c;

    public f(wlf<y> wlf, wlf<g> wlf2, wlf<d0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new LoadedFollowedShowsPresenterImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
