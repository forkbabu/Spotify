package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.pages.w;

public final class o1 implements fjf<n1> {
    private final wlf<w> a;

    public o1(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n1(this.a.get());
    }
}
