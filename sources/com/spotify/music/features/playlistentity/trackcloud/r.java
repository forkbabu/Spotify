package com.spotify.music.features.playlistentity.trackcloud;

import android.content.Context;

public final class r implements fjf<q> {
    private final wlf<Context> a;
    private final wlf<Boolean> b;

    public r(wlf<Context> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get().booleanValue());
    }
}
