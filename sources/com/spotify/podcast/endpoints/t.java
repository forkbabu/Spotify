package com.spotify.podcast.endpoints;

import com.spotify.remoteconfig.ba;

public final class t implements fjf<s> {
    private final wlf<v> a;
    private final wlf<ba> b;

    public t(wlf<v> wlf, wlf<ba> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get());
    }
}
