package com.spotify.music.features.playlistentity.datasource.sorting;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public final class c implements fjf<b> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<g> c;

    public c(wlf<Context> wlf, wlf<i> wlf2, wlf<g> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get());
    }
}
