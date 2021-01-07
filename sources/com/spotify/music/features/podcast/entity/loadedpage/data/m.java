package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.spotify.music.features.podcast.entity.g;

public final class m implements fjf<l> {
    private final wlf<g> a;

    public m(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
