package com.spotify.music.features.yourlibrary.musicpages.item;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.e1;

public final class n implements fjf<m> {
    private final wlf<Context> a;
    private final wlf<e1> b;

    public n(wlf<Context> wlf, wlf<e1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
