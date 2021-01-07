package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;

public final class p implements fjf<o> {
    private final wlf<LayoutInflater> a;
    private final wlf<zvd> b;
    private final wlf<DisplayMetrics> c;

    public p(wlf<LayoutInflater> wlf, wlf<zvd> wlf2, wlf<DisplayMetrics> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a, this.b, this.c);
    }
}
