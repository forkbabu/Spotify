package com.spotify.music.features.podcast.entity;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public final class k implements fjf<j> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<g> c;

    public k(wlf<Context> wlf, wlf<i> wlf2, wlf<g> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get(), this.c.get());
    }
}
