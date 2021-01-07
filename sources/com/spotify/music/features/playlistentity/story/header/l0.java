package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;

public final class l0 implements fjf<k0> {
    private final wlf<Context> a;

    public l0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get());
    }
}
