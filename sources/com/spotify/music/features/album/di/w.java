package com.spotify.music.features.album.di;

import android.content.Context;
import com.spotify.mobile.android.util.x;

public final class w implements fjf<Boolean> {
    private final wlf<Context> a;

    public w(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(!x.g(this.a.get()));
    }
}
