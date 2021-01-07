package com.spotify.music.podcast.episode.util;

import android.content.res.Resources;

public final class k implements fjf<j> {
    private final wlf<Resources> a;
    private final wlf<cqe> b;
    private final wlf<c> c;

    public k(wlf<Resources> wlf, wlf<cqe> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get());
    }
}
