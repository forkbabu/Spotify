package com.spotify.music.features.yourepisodes.interactor;

import com.spotify.music.podcastentityrow.v;

public final class j implements fjf<i> {
    private final wlf<v> a;

    public j(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
