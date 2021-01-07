package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.features.podcast.entity.g;
import com.spotify.music.features.podcast.entity.presentation.FilteringPresenter;
import com.spotify.music.libs.viewuri.c;

public final class n implements fjf<FilteringPresenter> {
    private final wlf<FilteringPresenter.a> a;
    private final wlf<g> b;
    private final wlf<u57> c;
    private final wlf<ere> d;
    private final wlf<c> e;
    private final wlf<androidx.lifecycle.n> f;

    public n(wlf<FilteringPresenter.a> wlf, wlf<g> wlf2, wlf<u57> wlf3, wlf<ere> wlf4, wlf<c> wlf5, wlf<androidx.lifecycle.n> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FilteringPresenter(ejf.a(this.a), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
