package com.spotify.music.podcast.freetierlikes.tabs;

import android.content.Context;

public final class e implements fjf<d> {
    private final wlf<Context> a;

    public e(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
