package com.spotify.music.libs.home.common.contentapi;

import androidx.lifecycle.n;

public final class a implements fjf<HomeSavedAlbumInteractor> {
    private final wlf<n> a;
    private final wlf<t8a> b;
    private final wlf<s9a> c;

    public a(wlf<n> wlf, wlf<t8a> wlf2, wlf<s9a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeSavedAlbumInteractor(this.a.get(), this.b.get(), this.c.get());
    }
}
