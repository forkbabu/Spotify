package com.spotify.music.behindthelyrics.presenter;

import com.spotify.mobile.android.util.ui.h;

public final class g implements fjf<f> {
    private final wlf<h> a;

    public g(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get());
    }
}
