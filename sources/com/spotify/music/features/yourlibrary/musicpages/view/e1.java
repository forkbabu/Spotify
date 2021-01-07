package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;

public final class e1 implements fjf<d1> {
    private final wlf<Context> a;

    public e1(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d1(this.a.get());
    }
}
