package com.spotify.music.behindthelyrics.persistence.database;

import io.reactivex.y;

public final class h implements fjf<g> {
    private final wlf<BehindTheLyricsTracksDatabase> a;
    private final wlf<y> b;

    public h(wlf<BehindTheLyricsTracksDatabase> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
