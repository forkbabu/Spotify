package com.spotify.music.offlinetrials.limited.trackentity;

import io.reactivex.y;

public final class o implements fjf<n> {
    private final wlf<l> a;
    private final wlf<y> b;

    public o(wlf<l> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get());
    }
}
