package com.spotify.music.podcast.episode.util;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.libs.collection.played.a;

public final class i implements fjf<h> {
    private final wlf<a> a;
    private final wlf<SnackbarManager> b;
    private final wlf<Context> c;

    public i(wlf<a> wlf, wlf<SnackbarManager> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
