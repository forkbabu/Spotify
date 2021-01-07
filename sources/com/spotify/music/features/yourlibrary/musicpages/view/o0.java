package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;

public final class o0 implements fjf<n0> {
    private final wlf<Context> a;

    public o0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a.get());
    }
}
