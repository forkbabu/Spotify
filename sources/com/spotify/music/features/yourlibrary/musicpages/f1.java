package com.spotify.music.features.yourlibrary.musicpages;

import android.util.DisplayMetrics;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.ui.fragments.logic.k;

public final class f1 implements fjf<e1> {
    private final wlf<DisplayMetrics> a;
    private final wlf<k> b;
    private final wlf<tpd> c;
    private final wlf<zec> d;
    private final wlf<w> e;

    public f1(wlf<DisplayMetrics> wlf, wlf<k> wlf2, wlf<tpd> wlf3, wlf<zec> wlf4, wlf<w> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static f1 a(wlf<DisplayMetrics> wlf, wlf<k> wlf2, wlf<tpd> wlf3, wlf<zec> wlf4, wlf<w> wlf5) {
        return new f1(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
