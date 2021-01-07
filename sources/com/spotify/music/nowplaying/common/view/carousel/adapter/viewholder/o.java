package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class o {
    private final wlf<LayoutInflater> a;
    private final wlf<zvd> b;
    private final wlf<DisplayMetrics> c;

    public o(wlf<LayoutInflater> wlf, wlf<zvd> wlf2, wlf<DisplayMetrics> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public n b(ViewGroup viewGroup, boolean z) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        zvd zvd = this.b.get();
        a(zvd, 2);
        zvd zvd2 = zvd;
        DisplayMetrics displayMetrics = this.c.get();
        a(displayMetrics, 3);
        a(viewGroup, 4);
        return new n(layoutInflater2, zvd2, displayMetrics, viewGroup, z);
    }
}
