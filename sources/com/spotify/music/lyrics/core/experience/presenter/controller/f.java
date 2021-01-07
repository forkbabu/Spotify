package com.spotify.music.lyrics.core.experience.presenter.controller;

import com.spotify.music.lyrics.core.experience.rx.a;

public final class f implements fjf<c> {
    private final wlf<a> a;

    public f(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
