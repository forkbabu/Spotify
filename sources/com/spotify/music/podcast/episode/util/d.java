package com.spotify.music.podcast.episode.util;

import android.content.res.Resources;

public final class d implements fjf<c> {
    private final wlf<Resources> a;

    public d(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
