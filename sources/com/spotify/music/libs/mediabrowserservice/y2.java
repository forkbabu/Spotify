package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

public final class y2 implements fjf<x2> {
    private final wlf<MediaSessionCompat> a;
    private final wlf<Context> b;
    private final wlf<n1> c;

    public y2(wlf<MediaSessionCompat> wlf, wlf<Context> wlf2, wlf<n1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x2(this.a.get(), this.b.get(), this.c.get());
    }
}
