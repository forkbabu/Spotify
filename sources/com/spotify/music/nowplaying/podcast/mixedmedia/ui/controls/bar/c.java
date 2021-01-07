package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;

public final class c implements fjf<a> {
    private final wlf<ControlBarViewBinder.a> a;

    public c(wlf<ControlBarViewBinder.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
