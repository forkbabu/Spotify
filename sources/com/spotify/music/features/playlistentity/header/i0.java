package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.spotify.playlist.endpoints.d;

public final class i0 implements fjf<h0> {
    private final wlf<Context> a;
    private final wlf<d> b;

    public i0(wlf<Context> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get());
    }
}
