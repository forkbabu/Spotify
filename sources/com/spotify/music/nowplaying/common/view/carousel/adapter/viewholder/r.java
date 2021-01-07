package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.video.l0;

public final class r {
    private final wlf<LayoutInflater> a;
    private final wlf<zvd> b;
    private final wlf<l0> c;

    public r(wlf<LayoutInflater> wlf, wlf<zvd> wlf2, wlf<l0> wlf3) {
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

    public q b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        zvd zvd = this.b.get();
        a(zvd, 2);
        l0 l0Var = this.c.get();
        a(l0Var, 3);
        a(viewGroup, 4);
        return new q(layoutInflater, zvd, l0Var, viewGroup);
    }
}
