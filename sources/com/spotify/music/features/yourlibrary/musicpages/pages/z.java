package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;

public final class z implements fjf<y> {
    private final wlf<Context> a;

    public z(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get());
    }
}
