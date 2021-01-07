package com.spotify.music.features.yourepisodes;

import com.spotify.music.features.yourepisodes.interactor.a;
import com.spotify.music.features.yourepisodes.interactor.d;
import com.spotify.music.features.yourepisodes.interactor.h;
import com.spotify.music.navigation.t;

public final class z implements fjf<YourEpisodesInjectorImpl> {
    private final wlf<d> a;
    private final wlf<h> b;
    private final wlf<a> c;
    private final wlf<c09> d;
    private final wlf<t> e;

    public z(wlf<d> wlf, wlf<h> wlf2, wlf<a> wlf3, wlf<c09> wlf4, wlf<t> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourEpisodesInjectorImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
