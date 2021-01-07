package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.libs.viewuri.c;

public final class y0 implements fjf<x0> {
    private final wlf<e1> a;
    private final wlf<MusicPagesLogger> b;
    private final wlf<l22> c;
    private final wlf<f> d;
    private final wlf<u22> e;
    private final wlf<b42> f;
    private final wlf<c> g;

    public y0(wlf<e1> wlf, wlf<MusicPagesLogger> wlf2, wlf<l22> wlf3, wlf<f> wlf4, wlf<u22> wlf5, wlf<b42> wlf6, wlf<c> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static y0 a(wlf<e1> wlf, wlf<MusicPagesLogger> wlf2, wlf<l22> wlf3, wlf<f> wlf4, wlf<u22> wlf5, wlf<b42> wlf6, wlf<c> wlf7) {
        return new y0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
