package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import com.spotify.mobile.android.video.l0;

public final class s implements fjf<r> {
    private final wlf<LayoutInflater> a;
    private final wlf<zvd> b;
    private final wlf<l0> c;

    public s(wlf<LayoutInflater> wlf, wlf<zvd> wlf2, wlf<l0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a, this.b, this.c);
    }
}
