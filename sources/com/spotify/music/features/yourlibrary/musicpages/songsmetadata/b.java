package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

public final class b implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public b(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
