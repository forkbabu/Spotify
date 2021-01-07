package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.Context;

public final class j1 implements fjf<i1> {
    private final wlf<Context> a;

    public j1(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i1(this.a.get());
    }
}
