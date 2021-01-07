package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.playlist.endpoints.d;

public final class w implements fjf<v> {
    private final wlf<String> a;
    private final wlf<d> b;

    public w(wlf<String> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get());
    }
}
