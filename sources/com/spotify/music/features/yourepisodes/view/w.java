package com.spotify.music.features.yourepisodes.view;

import com.spotify.mobile.android.ui.view.y;
import com.spotify.music.features.yourepisodes.a0;

public final class w implements fjf<v> {
    private final wlf<y> a;
    private final wlf<a0> b;

    public w(wlf<y> wlf, wlf<a0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get());
    }
}
