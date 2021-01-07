package com.spotify.music.features.podcast.entity.di;

import com.spotify.android.flags.c;
import com.spotify.music.libs.podcast.download.f0;

public final class k implements fjf<Boolean> {
    private final wlf<c> a;

    public k(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(f0.b(this.a.get()));
    }
}
