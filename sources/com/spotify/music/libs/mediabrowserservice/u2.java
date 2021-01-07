package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;

public final class u2 implements fjf<t2> {
    private final wlf<MediaSessionCompat> a;
    private final wlf<o2> b;

    public u2(wlf<MediaSessionCompat> wlf, wlf<o2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t2(this.a.get(), this.b.get());
    }
}
