package com.spotify.music.libs.mediasession;

import android.support.v4.media.session.MediaSessionCompat;

public final class g0 implements fjf<f0> {
    private final wlf<MediaSessionCompat> a;

    public g0(wlf<MediaSessionCompat> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get());
    }
}
