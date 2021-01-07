package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.video.l0;
import com.spotify.remoteconfig.u8;
import java.util.concurrent.Executor;

public final class k {
    private final wlf<LayoutInflater> a;
    private final wlf<l0> b;
    private final wlf<DisplayMetrics> c;
    private final wlf<v8> d;
    private final wlf<Executor> e;
    private final wlf<u8> f;

    public k(wlf<LayoutInflater> wlf, wlf<l0> wlf2, wlf<DisplayMetrics> wlf3, wlf<v8> wlf4, wlf<Executor> wlf5, wlf<u8> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public j b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        LayoutInflater layoutInflater2 = layoutInflater;
        l0 l0Var = this.b.get();
        a(l0Var, 2);
        l0 l0Var2 = l0Var;
        DisplayMetrics displayMetrics = this.c.get();
        a(displayMetrics, 3);
        DisplayMetrics displayMetrics2 = displayMetrics;
        v8 v8Var = this.d.get();
        a(v8Var, 4);
        v8 v8Var2 = v8Var;
        Executor executor = this.e.get();
        a(executor, 5);
        Executor executor2 = executor;
        u8 u8Var = this.f.get();
        a(u8Var, 6);
        a(viewGroup, 7);
        return new j(layoutInflater2, l0Var2, displayMetrics2, v8Var2, executor2, u8Var, viewGroup);
    }
}
