package com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu;

import androidx.fragment.app.c;

public final class e implements fjf<d> {
    private final wlf<b42> a;
    private final wlf<c> b;

    public e(wlf<b42> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get());
    }
}
