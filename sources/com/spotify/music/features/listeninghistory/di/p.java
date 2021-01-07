package com.spotify.music.features.listeninghistory.di;

import com.spotify.http.u;
import com.spotify.music.features.listeninghistory.datasource.c;

public final class p implements fjf<c> {
    private final wlf<u> a;

    public p(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return (c) je.d0(this.a.get(), "retrofitMaker", c.class, "retrofitMaker.createWebg…toryEndpoint::class.java)");
    }
}
