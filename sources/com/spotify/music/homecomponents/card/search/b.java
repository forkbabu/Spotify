package com.spotify.music.homecomponents.card.search;

import com.spotify.music.features.playlistentity.homemix.l;

public final class b implements fjf<a> {
    private final wlf<l> a;

    public b(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
