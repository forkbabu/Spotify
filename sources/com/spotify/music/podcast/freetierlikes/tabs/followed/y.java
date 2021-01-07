package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.view.View;

public final class y implements fjf<x> {
    private final wlf<z> a;
    private final wlf<View.OnLongClickListener> b;
    private final wlf<w> c;

    public y(wlf<z> wlf, wlf<View.OnLongClickListener> wlf2, wlf<w> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x(this.a.get(), this.b.get(), this.c.get());
    }
}
