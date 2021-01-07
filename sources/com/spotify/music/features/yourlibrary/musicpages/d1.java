package com.spotify.music.features.yourlibrary.musicpages;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.pages.w;
import com.spotify.music.features.yourlibrary.musicpages.view.MusicPagesViewLoadingTrackerConnectable;
import com.spotify.music.features.yourlibrary.musicpages.view.b1;
import com.spotify.music.features.yourlibrary.musicpages.view.j1;

public final class d1 {
    public static Optional<String> a(Fragment fragment) {
        Bundle D2 = fragment.D2();
        if (D2 == null) {
            D2 = je.D(fragment);
        }
        return Optional.fromNullable(D2.getString("uri"));
    }

    public static void b(MusicPagesDrillDownFragment musicPagesDrillDownFragment, h1 h1Var) {
        musicPagesDrillDownFragment.h0 = h1Var;
    }

    public static void c(MusicPagesFragment musicPagesFragment, h1 h1Var) {
        musicPagesFragment.h0 = h1Var;
    }

    public static void d(MusicPagesFragment musicPagesFragment, e1 e1Var) {
        musicPagesFragment.l0 = e1Var;
    }

    public static void e(MusicPagesDrillDownFragment musicPagesDrillDownFragment, g1 g1Var) {
        musicPagesDrillDownFragment.j0 = g1Var;
    }

    public static void f(MusicPagesFragment musicPagesFragment, g1 g1Var) {
        musicPagesFragment.j0 = g1Var;
    }

    public static void g(MusicPagesDrillDownFragment musicPagesDrillDownFragment, b1 b1Var) {
        musicPagesDrillDownFragment.i0 = b1Var;
    }

    public static void h(MusicPagesDrillDownFragment musicPagesDrillDownFragment, w wVar) {
        musicPagesDrillDownFragment.l0 = wVar;
    }

    public static void i(MusicPagesFragment musicPagesFragment, w wVar) {
        musicPagesFragment.k0 = wVar;
    }

    public static void j(MusicPagesDrillDownFragment musicPagesDrillDownFragment, MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        musicPagesDrillDownFragment.m0 = musicPagesViewLoadingTrackerConnectable;
    }

    public static void k(MusicPagesFragment musicPagesFragment, MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        musicPagesFragment.m0 = musicPagesViewLoadingTrackerConnectable;
    }

    public static void l(MusicPagesFragment musicPagesFragment, j1 j1Var) {
        musicPagesFragment.i0 = j1Var;
    }

    public static void m(MusicPagesDrillDownFragment musicPagesDrillDownFragment, ys2 ys2) {
        musicPagesDrillDownFragment.n0 = ys2;
    }

    public static void n(MusicPagesDrillDownFragment musicPagesDrillDownFragment, com.spotify.music.features.yourlibrary.musicpages.view.d1 d1Var) {
        musicPagesDrillDownFragment.k0 = d1Var;
    }
}
