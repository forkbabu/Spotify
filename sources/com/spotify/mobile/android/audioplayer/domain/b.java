package com.spotify.mobile.android.audioplayer.domain;

import android.media.AudioManager;

public final class b implements fjf<a> {
    private final wlf<AudioManager> a;

    public b(wlf<AudioManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
