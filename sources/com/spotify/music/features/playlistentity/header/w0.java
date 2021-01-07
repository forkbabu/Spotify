package com.spotify.music.features.playlistentity.header;

import android.content.Context;

public final class w0 implements fjf<u0> {
    private final wlf<Context> a;

    public w0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u0(this.a.get());
    }
}
