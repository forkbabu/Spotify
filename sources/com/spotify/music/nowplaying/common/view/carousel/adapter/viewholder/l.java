package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.spotify.mobile.android.video.l0;
import com.spotify.remoteconfig.u8;
import java.util.concurrent.Executor;

public final class l implements fjf<k> {
    private final wlf<LayoutInflater> a;
    private final wlf<l0> b;
    private final wlf<DisplayMetrics> c;
    private final wlf<v8> d;
    private final wlf<Executor> e;
    private final wlf<u8> f;

    public l(wlf<LayoutInflater> wlf, wlf<l0> wlf2, wlf<DisplayMetrics> wlf3, wlf<v8> wlf4, wlf<Executor> wlf5, wlf<u8> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static l a(wlf<LayoutInflater> wlf, wlf<l0> wlf2, wlf<DisplayMetrics> wlf3, wlf<v8> wlf4, wlf<Executor> wlf5, wlf<u8> wlf6) {
        return new l(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
