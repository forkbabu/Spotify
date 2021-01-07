package com.spotify.music.features.playlistallsongs;

import android.content.Context;
import com.spotify.music.navigation.b;

public final class h implements fjf<g> {
    private final wlf<Context> a;
    private final wlf<b> b;

    public h(wlf<Context> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
