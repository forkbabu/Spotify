package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;

public final class r implements fjf<q> {
    private final wlf<Context> a;

    public r(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get());
    }
}
