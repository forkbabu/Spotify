package com.spotify.music.features.yourlibrary.musicpages.item;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;

public final class p implements fjf<o> {
    private final wlf<Context> a;
    private final wlf<MusicPagesLogger> b;

    public p(wlf<Context> wlf, wlf<MusicPagesLogger> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get());
    }
}
